class Solve {
   int[] getMoreAndLess(int[] arr, int n, int x) {
        // code here
        
        // order of 1
        
        int[] ans = {-1, -1};
        int less = 0;
        int equal = 0;
        
        for(int i=0; i<n; i++){
            if(arr[i] < x){
                less++;
            }
            else if(arr[i] == x){
                equal++;
            }
            else{
                break;
            }
        }
        
        ans[0] = less + equal;
        ans[1] = n - less;
        
        return ans;
    }
}