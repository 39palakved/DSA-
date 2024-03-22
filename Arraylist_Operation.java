class Geeks
{
    // Function to insert element
    public static void insert(ArrayList<Character> clist, char c)
    {
        
        //add c to clist
        clist.add(c);
    }
    
    // Function to count frequency of element
    public static void freq(ArrayList<Character> clist, char c)
    {
        /*HashMap <Character,Integer> map = new HashMap<>();
        
      for(int i=0; i<clist.size();i++){
          map.put(clist.get(i),map.getOrDefault(clist.get(i),0)+1);
          
      }*/
        if(clist.contains(c))
        System.out.println(Collections.frequency(clist,c));
        else
        System.out.println("Not Present");
        
    }
}
