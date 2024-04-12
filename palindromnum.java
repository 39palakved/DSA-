class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        String str = Integer.toString(n);
        for(int i = 0 ; i <= str.length()-1-i; i++){
            
            if(str.charAt(i) == str.charAt(str.length()-1-i)){
                return "Yes";
            }else{
                break;
            }
            
        }
        return "No";

    }
}