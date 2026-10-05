1class Solution {
2    static int ans;
3    static int k2;
4    public void inorder(TreeNode root){
5        if(root == null) return;
6        inorder(root.left);
7        k2--;
8        if(k2 == 0) ans = root.val;
9        inorder(root.right);
10    }
11    public int kthSmallest(TreeNode root, int k) {
12        k2 = k;
13        ans = -1;
14        inorder(root);
15        return ans;
16
17    }
18}