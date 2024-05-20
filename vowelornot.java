class Solution{
    String isVowel(char c){
        // code here
        String s ="aeiouAEIOU";
        if(s.indexOf(c)==-1){
            return "NO";
        }
        return "YES";
    }
}
