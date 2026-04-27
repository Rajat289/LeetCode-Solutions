class Solution {
    public int repeatedNTimes(int[] nums) {
        int m = nums.length;
        int n = (m/2);
        int count = 0;
        HashSet<Integer>set = new HashSet<>();
        for(int i=0; i<m ; i++){
            if(set.contains(nums[i])) return nums[i];
            set.add(nums[i]);
        }
    return 0;
    }
}
