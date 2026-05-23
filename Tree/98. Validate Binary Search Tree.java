class Solution {
    public boolean isValidBST(TreeNode root) {
        
        return helper(root,null,null);
    }

    boolean helper(TreeNode node , TreeNode min , TreeNode max){
        if(node == null)
        return true;

        if(min!= null && min.val >= node.val){
            return false;
        }
        if(max != null && max.val <= node.val){
            return false;
        }
        return helper(node.left , min , node)
            && helper(node.right , node , max);
    }
}
