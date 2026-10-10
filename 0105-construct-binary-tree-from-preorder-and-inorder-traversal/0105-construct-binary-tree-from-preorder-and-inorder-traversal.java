class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        return build(0 , n-1 , 0 , n-1 , preorder , inorder);
    }
    public TreeNode build(int preLo , int preHi , int inLo , int inHi , int[] preorder, int[] inorder) {
        if(preLo > preHi || inLo > inHi) return null;
        int val = preorder[preLo];
        TreeNode root = new TreeNode(val);
        int r = 0;
        for(int i=inLo; i<=inHi; i++){
            if(inorder[i]==val){
                r = i;
                break;
            }
        }
        int curr = r - inLo;
        root.left = build(preLo+1 , preLo+curr , inLo , r-1 , preorder , inorder);
        root.right = build(preLo+curr+1 , preHi , r+1 , inHi , preorder , inorder);
        return root;
    }
}