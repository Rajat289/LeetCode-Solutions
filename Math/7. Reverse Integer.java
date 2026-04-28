class Solution {
    public int reverse(int x) {
        int digit,rev=0;
        boolean isNegative = (x < 0);
        x = Math.abs(x);
        while(x>0){
            digit = x%10;
            if (rev > 214748364 || (rev == 214748364 && digit > 7)) {
                return 0; 
            }
            if (rev < -214748364 || (rev == -214748364 && digit < -8)) {
                return 0; 
            }
            rev = rev*10 + digit;
            x/=10;
        }
        if (isNegative) {
            rev = -rev;
        }
        return rev;
    }
}
