class Solution {
    public int smallestSubstring(String s) {
        // Code here
        int len = s.length()+1;
        if(s.length()<3){
            return -1;
        }
        for(int i=0; i<s.length()-2;i++){
            for(int j=i+2; j<s.length(); j++){
             String str = s.substring(i,j+1);
               
               if(str.indexOf('1')!=-1 && str.indexOf('0')!=-1 && str.indexOf('2')!=-1){
                   len = Math.min(len,str.length());
                   break;
               }
               
            }
            if(len==s.length()+1){
                break;
            }
        }
        if(len!=s.length()+1)
        return len;
        return -1;
    }
};
