class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        List<Integer>[] graph= new List[n+1];
        int color[] = new int [n+1];
        for(int i=0; i<=n; i++)
            graph[i] = new ArrayList();
        for(int [] u: dislikes){
            graph[u[0]].add(u[1]);
            graph[u[1]].add(u[0]);
        }
        for(int i=1; i<=n; i++){
            if(color[i]==0){
                LinkedList<Integer> queue = new LinkedList();
                queue.add(i);
                color[i]=1;
                while(!queue.isEmpty()){
                    int top = queue.removeFirst();
                    for(int neighbor: graph[top]){
                        if(color[neighbor]==color[top])
                            return false;
                        if(color[neighbor]==0){
                            color[neighbor] = -color[top];
                            queue.add(neighbor);
                        }
                    }
                }
            }
        }        
        return true;
    }
}