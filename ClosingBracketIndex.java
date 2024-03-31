class Sol
{
    int closing (String s, int pos)
    {
        // your code here  
        Stack<Integer> st = new Stack();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='['){
                st.push(i);
            }
            else if(!st.isEmpty() && s.charAt(i)==']'){
                int l=st.pop();
                if(l==pos){
                    return i;
                }
                
            }
          
        }
        return -1;
    }
}