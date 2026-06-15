class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length/2;
        int posarr[]=new int[n];
        int negarr[]=new int[n];
        int ans[]=new int[2*n];
        int p=0;
        int q=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                posarr[p++]=nums[i];
            }else{
                negarr[q++]=nums[i];
            }
        }
        int index=0;
        for(int i=0;i<n;i++){
            ans[index++]=posarr[i];
            ans[index++]=negarr[i];
        }
        return ans;
    }
}
