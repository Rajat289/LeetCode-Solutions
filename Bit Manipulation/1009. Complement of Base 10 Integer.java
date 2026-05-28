class Solution {
    public int bitwiseComplement(int n) {
        if(n==0)return 1;
        int sum=0;
        int i=0;
        while(n>0){
            int r = n%2;
            sum += Math.pow(2,i)*(r^1);
            n/=2;
            i++;
        }
        return sum;
    }
}
