class Solution
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        sb.append(s1);
        if(sb.lastIndexOf(s2)!=-1){
            return true;
        }
        return false;
    }
    
}