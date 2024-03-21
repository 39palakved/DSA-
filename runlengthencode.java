class Solution {
    public static String encode(String s) {
        // code here
        int cnt =1;
        int i=0;
        StringBuilder sb = new StringBuilder();
        for( i=0; i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                cnt++;
                
            }
            else{
                sb.append(s.charAt(i));
                sb.append(cnt);
                cnt=1;
            }
        }
         sb.append(s.charAt(i));
                sb.append(cnt);
               
        return sb.toString();
    }
}