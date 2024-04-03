class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
            
        // Your code here
        int cnt=1;
        while(n>0){
            if((n&1)==1) return cnt;
            n>>=1;
            cnt++;
        }
            return 0;
    }
}