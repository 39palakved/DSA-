class Solution {
    static long maxDiamonds(int[] A, int N, int K) {
        // code here
        Arrays.sort(A);
        int sum =0;
        int n= A.length-1;
       int i=0;
       if(K==0){
          return 0; 
       }
      
       while(i<K){
           sum+=A[n];
           A[n] = A[n]/2;
           Arrays.sort(A);
           i++;
       }
       return sum;
    }
};