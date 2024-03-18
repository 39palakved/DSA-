class Solution { 
    long findMinSum(int[] A,int[] B,int n) { 
       Arrays.sort(A);
       Arrays.sort(B);
       long sum =0;
       for(int i=0; i<n; i++){
           long diff = Math.abs(A[i]-B[i]);
           sum+=diff;
       }
       return sum;
    }
}