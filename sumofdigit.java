class Solution{
    static int sumOfDigits(int N) {
        
        
        // code here
        
        int sum=0;
        while(N>0){
            int  mast=N%10;
             sum=sum+mast;
            N=N/10;
        }
        return sum;
    }
}
    

