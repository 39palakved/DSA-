class Solution
{
    public long reverse_digit(long n)
    {
        // Code here
       String num = "";
        String str = Long.toString(n);
        for(int i = str.length()-1 ; i >= 0 ; i--){
            if(str.charAt(i) != 0){
                num += str.charAt(i);
            }
        }
        
        long newNum = Long.parseLong(num);
        return newNum;
    }
}