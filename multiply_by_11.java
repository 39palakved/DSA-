class Solution 
{ 
    String multiplyby11(String number) 
    { 
        // code here
        int n= number.length();
        StringBuilder sb = new StringBuilder();
        int carry =0;
        for(int i=n-1 ; i>=0; i--){
         int x=Integer.parseInt(String.valueOf(number.charAt(i)));
         int m= 11*x+carry;
         sb.append(m%10);
         carry = m/10;
        }
        sb.reverse();
        String ans="";
        if(carry!=0){
            
         ans += String.valueOf(carry);
        ans +=sb.toString();
         return ans;
        }
        return sb.toString();
    }
}