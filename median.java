class Solution
{
    public int find_median(int[] v)
    {
        // Code here
        int ans = 0;
        Arrays.sort(v);
        int len = v.length-1;
        if(v.length % 2 == 0){
          ans = v[len/2] + v[(len/2)+1];
          return ans/2;
        }
        return v[len/2];
        
    }
}