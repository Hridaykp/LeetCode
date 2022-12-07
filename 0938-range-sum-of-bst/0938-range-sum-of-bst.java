class Solution {
    List<Integer> list;
    private void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        Set<Integer> set = new HashSet();
        for(int i=low; i<=high; i++) set.add(i);
        int res = 0;
        list = new ArrayList();
        inorder(root);
        for(int i=0; i<list.size(); i++)
            if(set.contains(list.get(i)))
                res += list.get(i);
        return res;
    }
}