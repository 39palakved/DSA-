class Solution {
    void leftRotate(int[] arr, int n, int d) {
        // code here
        int h[]=new int[d];
        int j=0;
        for(int i=0;i<d;i++){
            h[i]=arr[i];
        }
        for(int i=d; i<n;i++){
            arr[j]=arr[i];
            j++;
        }
        int i=0;
         for( i=0;i<d;i++){
            arr[j]=h[i];
           
            j++;
        }
        
    }
}