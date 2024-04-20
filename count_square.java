class Solution {
    static int countSquares(int N) {
        // code here
          double sq =Math.sqrt(N);
        
        if((int)sq * (int)sq == N){
            return (int)sq-1;
        }
        return (int)sq;
    }
}