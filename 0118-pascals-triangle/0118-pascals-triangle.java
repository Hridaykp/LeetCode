class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> row = new ArrayList();
            if (i<2){
                for(int j= 0;j<=i;j++){
                    row.add(1);
                }
            }
            else{
                row.add(1);
                List<Integer> last= res.get(i-1);
                for(int j=0;j<last.size()-1;j++){   
                    row.add(last.get(j)+last.get(j+1));
                }
                row.add(1);
            }
            res.add(row);
        }
        return res;
    }
}