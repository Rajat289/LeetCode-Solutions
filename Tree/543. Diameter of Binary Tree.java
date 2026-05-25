class Solution {
    int res=0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return res;
    }
    private int dfs(TreeNode root){
        if(root == null)return 0;
        int lh=dfs(root.left);
        int rh=dfs(root.right);
        res=Math.max(res, lh+rh);
        return 1 + Math.max(lh,rh);
    }
}
