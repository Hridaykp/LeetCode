
class Solution {
    public int maxLevelSum(TreeNode root) {
        int maxS = Integer.MIN_VALUE, maxL = 1;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        for (int level = 1; !q.isEmpty(); ++level) {
            int sum = 0;
            int size = q.size();
            while (size-- > 0) {
                TreeNode n = q.poll();
                sum += n.val;
                if (n.left != null) { 
                    q.add(n.left);
                }
                if (n.right != null) {
                    q.add(n.right);
                }
            }
            if (maxS < sum) {
                maxS = sum;
                maxL = level;
            }
        }
        return maxL;
    }
}