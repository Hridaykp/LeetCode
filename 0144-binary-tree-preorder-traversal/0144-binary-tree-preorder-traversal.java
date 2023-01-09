class Solution {
    private static void solver(TreeNode root,List<Integer> res){
     if(root==null) return;
        res.add(root.val);
        solver(root.left, res);
        solver(root.right, res);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
       ArrayList<Integer> res = new ArrayList();
       solver(root, res);
       return res;
    }
}