class Solution
{
    public:
    string reverseWord(string str)
    {
        // Your code goes here
      
        int j=0;
        for(int i=str.length()-1; i>j; i--){
          int hold = str[j];
          str[j]= str[i];
          str[i]= hold;

          j++;
        
    }
    return str;
    }
};
