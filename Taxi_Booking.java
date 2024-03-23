class Solution {
    public static int minimumTime(int N, int cur, int[] pos, int[] time) {
        // code here
       
        int arr[] = new int [N];
        for(int i=0; i<N ;i++){
            int ans = Math.abs((cur-pos[i])*time[i]);
            arr[i]= ans;
            
        }
        Arrays.sort(arr);
        return arr[0];
    }
}
        
