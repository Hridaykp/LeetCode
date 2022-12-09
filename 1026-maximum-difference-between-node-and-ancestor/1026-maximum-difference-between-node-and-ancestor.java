class Solution {
    int res ;
    private int[] helper(TreeNode root){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        if(root == null) return new int[]{min, max};
        if(root.left == null && root.right == null){
            min = root.val;
            max = root.val;
            return new int[]{min, max};
        }
        int left[] = helper(root.left);
        int right[] = helper(root.right);
        min = Math.min(left[0], right[0]);
        max = Math.max(left[1], right[1]);
        res = Math.max(res, Math.max(Math.abs(min-root.val), Math.abs(max-root.val)));
        min = Math.min(min, root.val);
        max = Math.max(max, root.val);
        return new int []{min, max};
        
    }
    public int maxAncestorDiff(TreeNode root) {
        res = 0;
        helper(root);
        return res;
    }
}