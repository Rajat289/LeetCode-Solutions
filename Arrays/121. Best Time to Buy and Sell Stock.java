class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int ans = 0;
        int set = prices[0];  

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < set) {
                set = prices[i];   
            } else {
                ans = prices[i] - set;  
                if (ans > max) {
                    max = ans;
                }
            }
        }
        return max;   
    }
}
