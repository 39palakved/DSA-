class Solution {
    int countSubstringWithEqualEnds(String s) {
        // code here
     
        HashMap <Character,Integer> map = new HashMap<>();
        int cnt = s.length();
        for(int i=0; i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
         
        }
        for(Character key:map.keySet()){
         cnt+=map.get(key)*(map.get(key)-1) /2;  
        }
        
        return  cnt;
    }
}