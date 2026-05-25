class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        Stack<TreeNode> stack=new Stack<>();
        for(int i:nums){
            TreeNode cu=new TreeNode(i);
            while(!stack.isEmpty() && stack.peek().val<i){
            cu.left=stack.pop();
        }
        if(!stack.isEmpty()){
            stack.peek().right=cu;
        }
        stack.push(cu);
    }
    while(stack.size()>1){
        stack.pop();
    }
    return stack.peek();
}
}
