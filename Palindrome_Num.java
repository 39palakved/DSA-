//Given an integer x, return true if x is a palindrome, and false otherwise.
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int number =x;

        int ans =0;
        int rem =0;
        
        while(number!=0){
            rem = number%10;
            number = number/10;
            ans = ans*10+rem;
            
        }
        return x==ans;

    }
        
}