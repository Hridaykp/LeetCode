class Solution {
    private static boolean checkChildren(TreeNode left , TreeNode right){
        if(left==null && right==null) return true;
        if(left==null || right==null) return false;
       // if(left.val != right.val)  return false;
        
        return (left.val == right.val) && checkChildren(left.left,right.right) && checkChildren(left.right,right.left);
    }
    public boolean isSymmetric(TreeNode root) {
       return checkChildren(root,root);
    }
}