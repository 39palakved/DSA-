class Solution
{
    static int majorityElement(int a[], int N)
    {
        // your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < N; i++) {
            if(map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            }
            else {
                map.put(a[i], 1);
            }
        }
        
        for(int key : map.keySet()) {
            if(map.get(key) > N/2) return key;
        }
        
        return -1;
    }
}