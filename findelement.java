class Solution {
    public long[] findElements( long a[], long n)
    {
        // Your code goes here
         Arrays.sort(a);
     long[] newArr = new long[a.length-2];
     for(int i = 0 ; i < n-2; i++){
         newArr[i] = a[i];
     }
     return newArr;
    
    }
}