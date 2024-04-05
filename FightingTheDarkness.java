class Solution{
    long maxDays(long arr[], int n){
        // code here 
       Arrays.sort(arr);
       return arr[arr.length-1];
    }
}