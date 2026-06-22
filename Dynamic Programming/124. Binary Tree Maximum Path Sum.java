class Solution {
    public int maxPathSum(TreeNode root) {
        int[]res={root.val};
        dfs(root,res);
        return res[0];
    }
    private int dfs(TreeNode node , int[]res){
        if(node == null)return 0;

        int leftsum=Math.max(0,dfs(node.left , res));
        int rightsum=Math.max(0,dfs(node.right , res));

        res[0]=Math.max(res[0],leftsum + rightsum + node.val);
        return node.val+Math.max(leftsum,rightsum);
    }
}
