class GFG
{
    long maxSum(long arr[] ,int n)
    {
    Arrays.sort(arr);
    int i=0;
    int j=n-1;
   long diff=0;
   long sum=0;
   while(i<j){
   diff=Math.abs(arr[i]-arr[j]);
   sum+=diff;
   i++;
   j--;
   }
   
   
   return 2*sum;
        
    }
}