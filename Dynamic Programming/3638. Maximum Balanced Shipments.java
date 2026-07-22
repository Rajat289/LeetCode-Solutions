class Solution {
    public int maxBalancedShipments(int[] weight) {
        int len = weight.length;
        int m = 0, count = 0;
        long peakWeight = Long.MIN_VALUE;
        for (int n = 1; n < len; n++) {
            if (n > m) {
                peakWeight = Math.max(peakWeight, weight[n - 1]);
                if (peakWeight > weight[n]) {
                    count++;
                    m = n + 1;
                    peakWeight = Long.MIN_VALUE;
                }
            }
        }
        return count;
    }
}
