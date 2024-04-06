class Solution
{
    
    public void sortIt(long arr[], long n)
    {
        //code here.
        ArrayList <Long>  even = new ArrayList<Long>();
        ArrayList <Long>  odd= new ArrayList<Long>();
        Arrays.sort(arr);
        
        for(int i=0; i<n; i++){
            if(arr[i]%2==0){
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
        }
        Collections.reverse(odd);
        int j=0;
        for(int i=0; i<odd.size();i++){
            arr[j]= odd.get(i);
            j++;
        }
        
        for(int i=0; i<even.size();i++){
            arr[j]= even.get(i);
            j++;
        }
    }
}