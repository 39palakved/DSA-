public class Solution {
    //DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int strStr(final String A, final String B) {
        StringBuilder sb = new StringBuilder(A);
         int ans =sb.indexOf(B);
         return ans;
    }
}
