//Remove repeated digits in a given number
class Solution
{
    public long modify(long N)
    {
        //code here
        StringBuilder sb = new StringBuilder();
        
        String s= Long.toString(N);
        sb.append(s.charAt(0));
        for(int i=1; i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                sb.append(s.charAt(i));
            }
           
                
            
        }
      
        
        return Long.parseLong(sb.toString());
    }
}