//Given a list of N words. Count the number of words that appear exactly twice in the list.
class Solution
{
    public int countWords(String list[], int n)
    {
        // code here 
      HashMap<String,Integer>map = new HashMap<>();
      for(String word:list){
          map.put(word,map.getOrDefault(word,0)+1);
      }
        int cnt=0;
        for(String a:map.keySet()){
            if(map.get(a)==2)
            cnt++;
        }
       return cnt; 
    }
}