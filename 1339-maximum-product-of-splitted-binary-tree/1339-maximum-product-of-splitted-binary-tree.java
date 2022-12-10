class Solution {
    long max,totalsum;
    private void getSum(TreeNode root){
        if(root == null) return ;
        totalsum += (long)root.val;
        getSum(root.left);
        getSum(root.right);
    }
    private long subtreeSum(TreeNode root){
        if(root == null) return 0;
        long left = subtreeSum(root.left);
        long right = subtreeSum(root.right);
        long sub_sum = left+right+root.val;
        
        max = Math.max(max, sub_sum*(totalsum-sub_sum));
        // System.out.println(sub_sum+" "+root.val+" "+max);
        return sub_sum;
        
    }
    public int maxProduct(TreeNode root) {
        getSum(root);
        subtreeSum(root);
        return (int)(max % 1000000007);
    }
}