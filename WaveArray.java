class Solution {
    public static void convertToWave(int n, int[] a) {
        // code here
        if(n==1){
            return ;
        }
        if(n%2==0){
            for(int i=0; i<n; i+=2){
                int temp = a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        if(n%2!=0){
            for(int i=0; i<n-1; i+=2){
                int temp = a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
    }
}
        