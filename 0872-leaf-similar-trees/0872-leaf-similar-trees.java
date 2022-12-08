class Solution {
    private void builder(TreeNode root, List<Integer>list){
        if(root == null) return;
        if(root.left == null && root.right == null)
            list.add(root.val);
        builder(root.left, list);
        builder(root.right, list);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer>list1 = new ArrayList();
        List<Integer>list2 = new ArrayList();
        builder(root1, list1);
        builder(root2, list2);
        return list1.equals(list2);
    }
}