//You are given a string S. Your task is to determine if the sum of ASCII values of all character results in a perfect square or not. If it is a perfect square then the answer is 1, otherwise 0.

class Solution{
    static int isSquare(String S)

    {
      int sum=0;  //code here
    for(int i=0; i<S.length();i++){
        sum+= (int)S.charAt(i);
        
    }
    int sqrt =(int) Math.sqrt(sum);
    if(sqrt*sqrt==sum){
        return 1;
    }
    return 0;
    }
}