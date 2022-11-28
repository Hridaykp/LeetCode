class Solution {
    private void builder(int start, int []cand, List<Integer>list, List<List<Integer>> res, int target){
        if(target == 0) res.add(new ArrayList(list));
        if(target < 0) return;
        for(int i=start; i<cand.length; i++){
            list.add(cand[i]);
            builder(i, cand, list, res, target-cand[i]);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] cand, int target) {
        List<List<Integer>> res = new ArrayList();
        builder(0, cand, new ArrayList(), res, target);
        return res;
    }
}