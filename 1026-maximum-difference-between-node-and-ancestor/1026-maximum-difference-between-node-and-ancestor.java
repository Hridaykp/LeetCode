class Solution {
    int res;
    private void helper(TreeNode root, int min, int max){
        if(root == null) return;
        min = Math.min(min, root.val);
        max = Math.max(max, root.val);
        res = Math.max(res, Math.abs(min-max));
        helper(root.left, min, max);
        helper(root.right, min, max);
        
    }
    public int maxAncestorDiff(TreeNode root) {
        helper(root, root.val, root.val);
        return res;
    }
}