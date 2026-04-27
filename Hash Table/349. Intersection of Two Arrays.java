class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for(int i : nums1){
            set.add(i);
        }
        for(int j : nums2){
            if(set.contains(j)){
                result.add(j);
                set.remove(j);
            }
        }
        int[] ans = new int[result.size()];   
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        
        return ans;
    }
}
