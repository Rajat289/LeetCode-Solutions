class Solution {
    public int[] findErrorNums(int[] nums) {
        int d=-1;
        int miss=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
        if(map.containsKey(i)){
            d=i;
        }
        map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                miss = i;
            }
        }
        return new int[]{d,miss};
    }
}
