class Solution {
    public static boolean isPerfect(int n, int[] arr) {
        // code here
         int count=0;
        int m=n;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=arr[m-1];
            m--;
        }
        for(int i=0;i<n;i++){
            if(arr[i]==a[i]){
                count++;
            }
        }
        if(count==n){
            return true;
        }
        else{
            return false;
        }
    }
}
        
