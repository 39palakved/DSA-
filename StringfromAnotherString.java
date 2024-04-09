class Solution{
    public static boolean isPass(String A, String B )
    {
        // Your code here
        int ans=0;
      int cntA[] = new int[256];
      int cntB[]= new int [256];
      for(int i=0; i<A.length();i++){
          cntA[A.charAt(i)-'A']++;
      }
      for(int i=0; i<B.length();i++){
          cntB[B.charAt(i)-'A']++;
      }
      for(int i=0; i<256;i++){
          if(cntA[i]<=cntB[i] && cntA[i]!=0){
              ans+=cntA[i];
          }
      }
      if(ans==A.length()){
          return true;
      }
      return false;
      
    }
    
}

