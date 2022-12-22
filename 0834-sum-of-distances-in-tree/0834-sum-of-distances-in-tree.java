class Solution {
   public int[] sumOfDistancesInTree(int n, int[][] edges) {
        List<Integer>[] graph = new List[n];
        int[] count = new int[n];
        Arrays.fill(count, 1);
        int[] res = new int[n];
        for (int i = 0; i < graph.length; i++) 
            graph[i] = new ArrayList<>();
        for (int[] u : edges) {
            graph[u[0]].add(u[1]);
            graph[u[1]].add(u[0]);
        }
        postOrder(0, -1, graph, count, res);
        preOrder(0, -1, graph, count, res, n);

        return res;
    }
    
    private void postOrder(int node, int parent, List<Integer>[] graph, int[] count, int[] res) {
        for (int child : graph[node]) {
            if (child != parent) {
                postOrder(child, node, graph, count, res);
                count[node] += count[child];
                res[node] += res[child] + count[child];
            }
        }
    }

    private void preOrder(int node, int parent, List<Integer>[] graph, int[] count, int[] res, int n) {
        for (int child : graph[node]) {
            if (child != parent) {
                res[child] = res[node] + (n - count[child]) - count[child];
                preOrder(child, node, graph, count, res, n);
            }
        }
    }
}