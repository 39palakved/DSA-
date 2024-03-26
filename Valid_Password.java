public class Solution {
    public int solve(String A) {
        if(A.length() >=8 && A.length() <= 15 && A.matches(".*\\d.*") &&  A.matches(".*[a-z].*") && A.matches(".*[A-Z].*")) {
            if (A.contains("@") || A.contains("#") || A.contains("%") || A.contains("&") || A.contains("!") ||
            A.contains("$") || A.contains("*")){
                return 1;
            }
        }
        return 0;
    }
}