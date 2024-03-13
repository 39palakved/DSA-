class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashMap <Integer,Integer> hs = new HashMap<>();
        int res =0,sum =0;
       
        for(int i:arr){
            sum= k-i;
            if(hs.containsKey(sum)){
                res+=hs.get(sum);
            }
              hs.put(i,hs.getOrDefault(i,0)+1);
        }

       return res;
    }
}
