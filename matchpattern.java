class GfG
{
/* The function returns an array of strings 
present in the dictionary which matches
the string pattern.
You are required to complete this method */
public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String p)
	{
	    //add code here.
	    ArrayList<String> li = new ArrayList<>();
	  HashMap<Character,Integer> map = new HashMap<>();
	  for(int i=0; i<p.length();i++){
	      map.put(p.charAt(i),map.getOrDefault(p.charAt(i),0)+1);
	      
	  }
	  for(int i=0; i<dict.size();i++){
	      String s = dict.get(i);
	      int j=0;
	      int flag=0;
	      HashMap <Character, Integer> map1 = new HashMap<>();
	      if(s.length()==p.length()){
	      for(int k=0; k<s.length();k++){
	            map1.put(s.charAt(k),map1.getOrDefault(s.charAt(k),0)+1);
	      }
	      
	        for(int m=0; m<s.length();m++){ 
	       
	            if(map.get(p.charAt(j))!=map1.get(s.charAt(j))){
	            flag=1;
	            break;
	       }
	        else{
	            j++;
	       }
	      }
	      
	     if(flag==0){
	        li.add(s);
	    }
	  }
	      
	    map1.clear();  
	  }
	   return li; 
	}
}