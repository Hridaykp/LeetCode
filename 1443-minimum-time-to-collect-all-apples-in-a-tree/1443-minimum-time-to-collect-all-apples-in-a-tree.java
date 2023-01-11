class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        List<List<Integer>> adjList = new ArrayList();
        for(int i=0; i<n; i++)
            adjList.add(new ArrayList());
        
        for(int edge[]: edges){
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        boolean[] seen = new boolean [n];
        return dfs(adjList, hasApple, seen, 0);
    }
    private int dfs(List<List<Integer>> adjList, List<Boolean> hasApple, boolean[] seen, int node){
        seen[node] = true;
        int time = 0;
        for(int vertex: adjList.get(node))
            if(seen[vertex] == false)
                time += dfs(adjList, hasApple, seen, vertex);
        
        if (node != 0 && (hasApple.get(node) || time > 0))
            time += 2;
        return time;
    }
}