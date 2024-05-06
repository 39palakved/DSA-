class Solution
{
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
        ArrayList<Integer> li = new ArrayList<>();
        HashSet <Integer> set = new HashSet<>();
        for(int i=0; i<m;i++){
            set.add(b[i]);
        }
        for(int j: a){
            if(!set.contains(j)){
                li.add(j);
            }
        }
        return li;
    }
}
