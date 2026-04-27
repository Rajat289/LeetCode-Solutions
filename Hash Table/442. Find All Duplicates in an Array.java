class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> map= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int num=Math.abs(nums[i]);
            int idx=num-1;
            if(nums[idx]<0)
                map.add(num);
            nums[idx]*=-1;
            
        }
        return map;
    }
}
