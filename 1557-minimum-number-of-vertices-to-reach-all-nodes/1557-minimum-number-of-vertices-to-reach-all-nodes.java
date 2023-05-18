class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> res = new ArrayList();
        Set<Integer> set1 = new HashSet();
        Set<Integer> set2 = new HashSet();
        for(List<Integer> edge: edges){
            set1.add(edge.get(0));
            set2.add(edge.get(1));
        }
        for(int i: set1){
            if(!set2.contains(i))
                res.add(i);
        }
        
        return res;
    }
}