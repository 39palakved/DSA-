class Solution{
    void swapDigits(Str n1, Str n2){
        
        StringBuilder sb = new StringBuilder(n1.val);
        StringBuilder sb2 = new StringBuilder(n2.val);
        char temp= sb.charAt(0);
        
        sb.setCharAt(0,sb2.charAt(sb2.length()-1));
        sb2.setCharAt(sb2.length()-1,temp);
        
        temp= sb2.charAt(0);
       
        sb2.setCharAt(0,sb.charAt(sb.length()-1));
        sb.setCharAt(sb.length()-1,temp);
        
        n1.val = sb.toString();
        n2.val = sb2.toString();
    }
}