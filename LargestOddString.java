class Solution {

    String maxOdd(String s) {
        // code hereimt 
      int n=s.length()-1;
      for(int i=n; i>=0;i--){
          int last = Integer.parseInt(String.valueOf(s.charAt(i)));
          if(last%2!=0){
              String ans = s.substring(0,i+1);
              return ans;
          }
          
      }
     return "";
  

    }
}