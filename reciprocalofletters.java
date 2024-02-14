class Solution{
    static String reciprocalString(String S){
        // code here
        for(int i=0; i<S.length();i++){
            if(S.charAt(i)>='a'&& S.charAt(i)<='z'){
                int a=S.charAt(i);
                int b = a-97;
                char c= 122-b;
                S.charAt(i)=c;
                
            }
            if(S.charAt(i)>='A'&& S.charAt(i)<='Z'){
                int a=S.charAt(i);
                int b = a-65;
                char c= 90-b;
                S.charAt(i)=c;
                
            }
        }
    }
}