class Solution {
    int n;
    private void dfs(List<List<Integer>> res, int[][] graph, List<Integer> list, int src, int dest){
        if(src == n - 1){ 
            res.add(new ArrayList(list));
            return;
        }
        for(int node: graph[src]){
            list.add(node);
            dfs(res, graph, list, node, dest);
            list.remove(list.size()-1);
        }
        
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        n = graph.length;
        List<List<Integer>> res = new ArrayList();
        List<Integer> list = new ArrayList();
        list.add(0);
        dfs(res, graph, list, 0, n-1);
        return res;
    }
}