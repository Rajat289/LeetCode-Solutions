class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {  
                digits[i]++;  // Increment and return if it's not 9
                return digits;
            } else {
                digits[i] = 0;  // If it's 9, turn it into 0
            }
        }

        // If we exit the loop, all digits were 9 (e.g., 999 → 1000)
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1; // Set the first digit to 1, rest are default 0
        return newDigits;
    }
}
