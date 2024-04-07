class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
       int sum = 0;
       int j = 0;
       for(int i=0;i<n;i++){
          sum+=arr[i];
          while(j<arr.length && sum>s){
            sum-=arr[j];
            j++;
         }
         if(sum==s && i>=j){
             list.add(j+1);
             list.add(i+1);
             break;
         }
       }
       if(list.size()==0)
          list.add(-1);
        return list;
    }
}