class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        String Words[] = S.split("\\.");
        StringBuilder reversed = new StringBuilder();
        for(int i=Words.length-1; i>=0; i--){
            reversed.append(Words[i]);
            if(i!=0){
                reversed.append(".");
            }
            
        }
        return reversed.toString();
    }
}