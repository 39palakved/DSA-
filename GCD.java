class Solution
{
    public int gcd(int N , int arr[]) 
    { 
       //code here.
       if(arr.length==1){
          return arr[0] ;
       }
       Arrays.sort(arr);
       int n=arr[0];
      
       
       while(n>=1){
            int temp=0;
           for(int i=0; i<N;i++){
               if(arr[i]%n==0){
                  temp++;
               }
               
           }
           if(temp==N){
               return n;
           }
           
           n--;
       }
       return 1;
    } 
}