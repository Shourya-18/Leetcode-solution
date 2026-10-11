1class Solution {
2    public boolean isSymmetric(TreeNode root) {
3        mirror(root.left);
4        return isIdentical(root.left , root.right);
5    }
6
7    boolean isIdentical(TreeNode p , TreeNode q){
8        if(p==null && q==null) return true;
9        if(p==null || q==null) return false;
10        if(p.val!=q.val) return false;
11        return isIdentical(p.left , q.left) && isIdentical(p.right , q.right);
12    }
13
14    void mirror(TreeNode root){
15        if(root == null) return;
16        TreeNode temp = root.left;
17        root.left = root.right;
18        root.right = temp;
19        mirror(root.left);
20        mirror(root.right);
21    }
22}