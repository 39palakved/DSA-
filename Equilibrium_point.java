class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

 long sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        long leftsum = 0;
        long rightsum = sum;
        
        for(int i=0;i<n;i++){
            rightsum-=arr[i];
            if(leftsum == rightsum) return i+1;
            leftsum+=arr[i];
        }
        return -1;
        // Your code here
    }
}
