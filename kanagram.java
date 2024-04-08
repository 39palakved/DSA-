class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        // code here
        if(s1.length()!=s2.length()){
            return false;
        }
        if(s1.length()==k){
            return true;
        }
        HashMap <Character,Integer> map1 = new HashMap<>();
        HashMap <Character,Integer> map2 = new HashMap<>();
        for(int i=0; i<s1.length();i++){
            map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i),0)+1);
                
        }
        for(int i=0; i<s2.length();i++){
            map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
        }
        int cnt=0;
        for(char key : map1.keySet()){
          int feq1 = map1.get(key);
          int feq2 = map2.getOrDefault(key,0);
            if(feq1>feq2){
                cnt= cnt+(feq1-feq2);
            }
            
        }  
         
        
      return cnt<=k;
    }
}