class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> p = new LinkedList<TreeNode>();
        p.add(root);
        while (p.peek() != null) {
            TreeNode node = p.poll();
            p.add(node.left);
            p.add(node.right);
        }
        while (!p.isEmpty() && p.peek() == null)
            p.poll();
        return p.isEmpty();
    }
}