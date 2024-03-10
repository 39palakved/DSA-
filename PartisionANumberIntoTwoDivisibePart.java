class Solution{
    static String stringPartition(String S, int a, int b){
        // code here
        String ans="";
        String str="";
        for(int i=1; i<S.length();i++){
           String s1 = S.substring(0,i);
           String s2 = S.substring(i,S.length());
           int o1 = Integer.parseInt(s1);
           int o2 = Integer.parseInt(s2);
           if(o1%a==0 && o2%b==0){
               ans+=s1;
               ans+=" ";
               ans+=s2;
               break;
           }
           
       
       }
       if(ans.length()==0){
           return "-1";
       }
       else{
           return ans;
       }
    }
}

