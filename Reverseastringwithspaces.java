class Solution
{
    String reverseWithSpacesIntact(String S)
    {
        // your code here
        int i=0;
        int len =0;
     
        
        String ans = S.replace(" ","");
       StringBuilder sb = new StringBuilder();
        
        int cnt=ans.length()-1;
        for(i=0;i<S.length();i++){
            char ch = S.charAt(i);
            if(ch==' '){
                sb.append(' ');
            }
            else{
             sb.append(ans.charAt(cnt--));
             
             
            }
            
             
             
        }
       
        
        return sb.toString();
    }
}