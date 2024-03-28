class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0; i<n; i++){
            li.add(arr[i]);
        }
        int ans =0;
        if(li.contains(x)){
         ans = Collections.frequency(li,x);
        }
        return ans;
    }
}