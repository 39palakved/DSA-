class Solution{
    long ExtractNumber(String S){
        //code here
        long max=0;
        String st[]=S.split(" ");
        for(String s:st){
           if(Character.isDigit(s.charAt(0)) && !s.contains("9")){
               max = Math.max(Long.parseLong(s),max);
           }
        }
        if(max==0)
       return -1;
       return max;
    }
}