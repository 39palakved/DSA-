//Given a alphanumeric string S, extract maximum numeric value from S.
class Solution 
{ 
    static int extractMaximum(String S) 
    { 
        // code here
        int dig=0;
      int ans=-1;
        
        for(int i=0; i<S.length();i++){
            if(Character.isDigit(S.charAt(i))){
                dig=dig*10+(S.charAt(i)-'0');
                ans =Math.max(ans,dig);
                
            }
            else{
                dig=0;
            }
           
            
        }
       return ans; 
    }    
} 
