class Solution
{
    public long  unique_substring_sum(String s, int k)
    {
        // Code here
        int n= s.length();
         if(n%k!=0) return -1;
        long sum =0;
      HashSet<String> set = new HashSet<>();
        for(int i=0; i<s.length();i+=k){
            String sb = s.substring(i,Math.min(i + k, s.length()));
            if(set.add(sb)){
               long a = Long.parseLong(sb,2);
               sum+=a; 
            }
            
        }
       
   return sum;
    }
}
