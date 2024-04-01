class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack <Integer> st = new Stack<>();
        for(int i=0 ;i<S.length();i++){
            if(Character.isDigit(S.charAt(i))){
                int n= Character.getNumericValue(S.charAt(i));
                st.push(n);
            }
            else {
                int n1 = st.pop();
                int n2 = st.pop();
                char c = S.charAt(i);
                switch(c){
                    case '+' : st.push(n1+n2);
                               break;
                   case '-' : st.push(n2-n1);
                               break;
                   case '*' : st.push(n1*n2);
                               break;
                    case '/' : st.push(n2/n1);
                               break;
                               
                } 
            }
            
            
        }
        return st.peek();
    }
}