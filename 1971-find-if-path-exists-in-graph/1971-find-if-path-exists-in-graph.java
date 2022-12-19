class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> map=new HashMap();
        for(int[] a: edges){
            int u=a[0];
            int v=a[1];
            map.putIfAbsent(u, new ArrayList());
            map.get(u).add(v);
            map.putIfAbsent(v, new ArrayList());
            map.get(v).add(u);
        }

        Set<Integer> visited = new HashSet();
        Queue<Integer> q = new LinkedList();
        q.add(source);
        visited.add(source);
        while(!q.isEmpty()){
            int curr=q.poll();
            if(curr==destination) return true;
            List<Integer> list = map.get(curr);
            for(int val: list){
                if(!visited.contains(val)){
                    q.add(val);
                    visited.add(val);
                }
            }
        }
        return visited.contains(destination);
    }
}