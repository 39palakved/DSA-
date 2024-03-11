class Sol
{
    public static String stringSort (String s)
    {
        // your code here
        String up="";
        String low="";
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                up+=s.charAt(i);
            }
            else{
               low+=s.charAt(i) ;
            }
        }
        char arr1 [] = up.toCharArray();
        char arr2[] = low.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        up = String.valueOf(arr1);
        low = String.valueOf(arr2);
        int i=0;
        String ans="";
        while(i<up.length() && i<low.length()){
            ans+=up.charAt(i);
            ans+=low.charAt(i);
            i++;
        }
         while(i<up.length()){
            ans+=up.charAt(i);
            i++;
        }
         while(i<low.length()){
        
            ans+=low.charAt(i);
            i++;
        }
       return ans;
    }
}