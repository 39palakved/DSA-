class Solution 
{ 
    int fun(String s) 
    {
        // code here
        ArrayList<String> li = new ArrayList<>();
        
        for(int i=0; i<s.length()-1;i++){
            String str = s.substring(i,i+2);
            li.add(str);
        }
        HashSet<String>set = new HashSet<>();
        for(int i =0; i<li.size();i++){
            set.add(li.get(i));
        }
        return set.size();
    }
} 