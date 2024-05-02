class Solution {
    public static String compareNM(int n, int m) {
        // code here
          String result=(n==m)? "equal":(n<m)? "lesser": "greater";
               return result;
    }
}