class Solution {
    static int max;
    public int diameterOfBinaryTree(TreeNode root) {
        max = 0;
        level(root);
        return max;
    }
    int level(TreeNode root){
        if(root == null) return 0;
        int leftlevel = level(root.left);
        int rightlevel = level(root.right);
        max = Math.max(max,leftlevel+rightlevel);
        return 1 + Math.max(leftlevel , rightlevel);
    }
}

