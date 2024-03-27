class Solution {
    public static int getMaximum(int N, int[] arr) {
        // code here
        long sum =0;
        for(int i=0; i<N;i++){
            sum+=arr[i];
        }
        while(sum%N!=0){
            N--;
        }
        return N;
    }
}