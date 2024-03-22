class Complete{
    
   
    // Function for finding maximum and value pair
    public static int maximumSum (int n, int m, int arr[][]) {
        //Complete the function
        int sum=0;
        int num =0;
        for(int i=0; i<n; i++){
            Arrays.sort(arr[i]);
            
        }
        for(int i=n-1; i>=0; i--){
            if(i==n-1){
              num =arr[i][m-1];
             sum+=num;
            }
            else {
                int l =m-1;
                while(l>=0){
                    if(arr[i][l]>=num){
                       l--; 
                    }
                    else{
                        break;
                    }
                }
                if(l<0){
                  return 0;  
                }
               else{
                num=arr[i][l];
                sum+=num;
               }
            }
            
                
        }
        
        return sum;
        
    }
    
    
}





