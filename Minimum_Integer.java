class Solution {
    public static int minimumInteger(int N, int[] a) {
        // code here
        Arrays.sort(a);
        int min = a[N-1]+1;
       int  h=min;
        long s=a[0];
        for(int i=1; i<N;i++){
            s+=a[i];
        }
        for(int i=0; i<N;i++){
            if(s<=(long)a[i]*(long)N){
               min = Math.min(min,a[i]);
               
            }
        }
        
        if(min==h){
            return -1;
        }
        return min;
    }
}
        
