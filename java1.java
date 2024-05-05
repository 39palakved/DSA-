class Solution {
    boolean fascinating(long n) {
        // code here
        if (n < 100) {
            return false;
        }
        HashSet<Character> set = new HashSet<>();
        for (char digit = '1'; digit <= '9'; digit++) {
            set.add(digit);
        }
        String concatinatedString = Long.toString(n) + Long.toString(n * 2) + Long.toString(n * 3);
        for (char c : concatinatedString.toCharArray()) {
            if (!set.contains(c)) {
                return false;
            } else {
                set.remove(c);
            }
        }
        return true;
    }
}