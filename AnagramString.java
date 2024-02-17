class Solution {
    static int areAnagram(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length()){
            return 0;
        }
        int a1[]=new int[26];
        int a2 []= new int[26];
        for(int i=0; i<s1.length();i++){
            a1[s1.charAt(i)-'a']++;
            a2[s2.charAt(i)-'a']++;
        }
        for(int i=0; i<26;i++){
            if(a1[i]!=a2[i]){
                return 0;
            }
        }
        return 1;
    }
}