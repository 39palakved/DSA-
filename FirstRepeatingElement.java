class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        int feq []= new int[1000000];
        for(int i=0; i<n;i++){
            feq[arr[i]]++;
        }
        for(int i=0; i<n;i++){
            if(feq[arr[i]]>1){
                return i+1;
            }
        }
        return -1;
    }
}
