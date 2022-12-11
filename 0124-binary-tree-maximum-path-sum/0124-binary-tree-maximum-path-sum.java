class Solution {
    int sum;
    int max = Integer.MIN_VALUE;
    private int subtree_sum(TreeNode root){
        if (root == null) return 0;
        int left = Math.max(0,subtree_sum(root.left));
        int right = Math.max(0,subtree_sum(root.right));
        sum = left+right+root.val;
        max = Math.max(max, sum);
        return Math.max(left, right)+root.val;
    }
    public int maxPathSum(TreeNode root) {
        subtree_sum(root);
        return max;
    }
}