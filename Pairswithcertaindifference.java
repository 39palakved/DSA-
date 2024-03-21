class Solution { 
    public static int maxSumPairWithDifferenceLessThanK(int arr[], int N, int K) 
    {
        // Your code goes here 
         Arrays.sort(arr);
        int sum = 0;
        int i = N-1;
        while(i>0){
            if(arr[i] - arr[i-1] < K){
                sum = sum + arr[i] + arr[i-1];
                i = i-2;
                
            }
            else i--;
                
        }
        
        return sum;
    }
    
}