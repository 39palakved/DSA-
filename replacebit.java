class Solution{
    int replaceBit(int N, int K){
        String s = Integer.toBinaryString(N);
         StringBuilder sb = new StringBuilder(s);
        char ch[]= s.toCharArray();
        if(K>s.length()){
            return N;
        }
        if(sb.charAt(K-1)=='1'){
            sb.setCharAt(K-1,'0');
            
        }
       
        int n= Integer.parseInt(sb.toString(),2);
        return n;
      
        
    }
}