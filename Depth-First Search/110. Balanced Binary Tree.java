class Solution {
    private int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftheight = dfs(root.left);
        if(leftheight == -1){
            return -1;
        }
        int rightheight = dfs(root.right);
        if(rightheight == -1){
            return -1;
        }
        if(Math.abs(leftheight - rightheight)>1){
            return -1;
        }
        return 1+Math.max(leftheight , rightheight);
    }
    public boolean isBalanced(TreeNode root) {
        return dfs(root) != -1;
    }
}
