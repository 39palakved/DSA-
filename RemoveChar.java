//Remove all characters other than alphabets
class Solution{
    String removeSpecialCharacter(String s) {
        // code here
        
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            if((c>='A'&& c<='Z')||(c>='a' && c<='z')){
                sb.append(c);
            }
        }
        String ans = sb.toString();
        return ans.isEmpty()?"-1":ans;
    }
}