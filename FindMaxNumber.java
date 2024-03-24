class Solution {
    static String findMax(String N) {
        // code here
        char arr []=  N.toCharArray();
        Arrays.sort(arr);
        String ans = new String(arr);
        StringBuilder sb = new StringBuilder(ans);
        sb.reverse();
        return sb.toString();
    }
};