class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;

        return newtree (nums , 0 , nums.length-1);

    }
    public TreeNode newtree(int nums[] , int start ,int end){
        if(start > end)
            return null;
        int mid = (start+end)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = newtree(nums , start , mid-1);
        node.right = newtree(nums , mid+1 , end);
        return node;
    }
    
}
