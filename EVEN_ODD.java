class Solution {
    static void reArrange(int[] arr, int N) {
        // code here
        int even [] =new int[N/2];
        int odd [] = new int[N/2];
        int j=0;
        int k=0;
        for(int i=0; i<N; i++){
            if(arr[i]%2==0){
                even[j] =arr[i];
                j++;
            }
            else{
                odd[k]=arr[i];
                k++;
            }
        }
         j=0;
        for(int i=0; i<N-1;i+=2){
            arr[i]=even[j];
            arr[i+1]=odd[j];
            j++;
        }
    }
};