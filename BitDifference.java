class Solution{
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        
        // Your code here
        int d = a^b;
        int cnt =0;
        while(d!=0){
            if((d&1)==1){
                cnt++;
            }
            d=d>>1;
        }
        return cnt;
        
        
    }
    
    
}