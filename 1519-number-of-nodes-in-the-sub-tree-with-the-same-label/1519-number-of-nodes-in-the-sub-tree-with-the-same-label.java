class Solution {
    private int[] dfs(List<List<Integer>> adjList, int [] res, String labels, int node, boolean [] seen){
        int[] freq = new int[26];
        if(seen[node]) return freq;
        seen[node] = true;
        
        for(int adjacent : adjList.get(node)){
            if(seen[adjacent] == false){
                int[] output = dfs(adjList, res, labels, adjacent, seen);     
                for(int i = 0; i < 26; i++)
                    freq[i] += output[i];
            }
        }
        res[node] = ++freq[labels.charAt(node) - 'a'];
        return freq;
    }
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        int res[] = new int[n];
        List<List<Integer>> adjList = new ArrayList();
        
        for(int i=0; i<n; i++)
            adjList.add(new ArrayList());
        
        for(int edge[]: edges){
            int u = edge[0], v = edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        boolean [] seen = new boolean[n];
        dfs(adjList, res, labels, 0, seen);
        return res;
    }
}