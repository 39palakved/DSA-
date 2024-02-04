//Given a string S, the task is to change the complete string to Uppercase or Lowercase depending upon the case for the first character.
class Solution{
    String modify(String s){
        if(s.charAt(0)>='a' && s.charAt(0)<='z'){
            return s.toLowerCase();
            
        }
        else{
            return s.toUpperCase();
        }
    }
}