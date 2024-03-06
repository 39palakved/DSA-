class Solution {
    long sumOfSeries(long n) {
        // code here
        if(n==1){
            return 1;
        }
        long sum =0;
        for(int i=1; i<=n;i++){
            sum+= (long)Math.pow(i,3);
        }
        return sum;
    }
}