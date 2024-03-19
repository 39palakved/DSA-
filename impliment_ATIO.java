
//Given a string, s, the objective is to convert it into integer format without utilizing any built-in functions.
// If the conversion is not feasible, the function should return -1.

//Note: Conversion is feasible only if all characters in the string are numeric or if its first character is '-' and rest are numeric.

class Solution
{
    int atoi(String s) {
	// Your code here
	int res=0;
	int start = 0;
	
	if(s.charAt(0)=='-'){
	    start =1;
	}
	String sub  =s.substring(start,s.length());
	  if(!sub.matches("\\d+")){
	      return -1;
	  }
	  for(int i=start; i<s.length();i++){
	     char num = s.charAt(i);
	     int h=num-'0';
	     res = res*10+h;
	     
	  }
	  if(start==1){
	      res = 0 -res;
	  }
	  return res;
    }
}
