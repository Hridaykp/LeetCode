
class Solution {
    int Sum ;
    private void helper(TreeNode root, int subSum){
        if(root == null) 
            return;
        subSum = subSum*10 + root.val ;
        if(root.left == null && root.right == null){
            Sum += subSum;
            return;
        }
        helper(root.left, subSum);
        helper(root.right, subSum);
    }
    public int sumNumbers(TreeNode root) {
        helper(root, 0);
        return Sum;    
    }
}