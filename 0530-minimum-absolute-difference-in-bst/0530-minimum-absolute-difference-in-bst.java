class Solution {
    int res = Integer.MAX_VALUE;
    Integer prevValue = null;
    public int getMinimumDifference(TreeNode root) {
        if(root == null) return res;
        getMinimumDifference(root.left);
        
        if(prevValue != null)
            res = Math.min(res, root.val - prevValue);
         prevValue = root.val;
        
        getMinimumDifference(root.right);
        
        return res;
    }
}