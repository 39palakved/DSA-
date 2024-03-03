//Count the numbers between 1 to N containing 4 as a digit.
class Solution {
    static int countNumberswith4(int N) {
        // code here
        int count=0;
        for(int i=1; i<=N ;i++){
            String s = Integer.toString(i);
            if(s.indexOf('4')!=-1){
                count++;
            }
        }
        return count;
    }
};