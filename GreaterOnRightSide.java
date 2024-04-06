class Solution {
    void nextGreatest(int arr[], int n) {
        // code here
      
        int max1;
        if(n==1){
            arr[0]=-1;
        }
       else{
        for(int i=0; i<n-1;i++){
            max1=arr[i+1];
            for(int j=i+1; j<n;j++){
                 max1 = Math.max(max1,arr[j]);
            }
            arr[i]= max1;
        }
        arr[n-1]= -1;
       
        }
    }
}