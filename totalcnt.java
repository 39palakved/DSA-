class Solution {
    int totalCount(int[] arr, int n, int k) {
        // code here
        int sum =0;
        int cnt =0;
        int m=0;
        for(int i=0; i<n; i++){
            int q = arr[i]/k;
            int rem = arr[i]%k;
            if(rem==0){
                m=0;
                
            }
            else m=1;
            cnt = m+q;
            sum+=cnt;
            cnt=0;
        }
        return sum;
    }
}
