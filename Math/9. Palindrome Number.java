class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0 ){
            return false;
        }
        if(x<10){
            return true;
        }
        
        else
        {
            int temp = x;
            int rev=0;
            while(x>0){
                rev = rev*10 + x%10;
                x/=10;
            }
            if(rev == temp){
                return true;
            }
            else{
                return false;
            }
        }
        
    }
}
