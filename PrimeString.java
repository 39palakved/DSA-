class Solution
{
    public boolean isPrimeString(String s)
        {
            //code here.
            int sum=0;
            for(int i=0; i<s.length();i++){
                int a = (int)(s.charAt(i));
                sum+=a;
            }
            for(int i=2; i<sum; i++){
                if(sum%i==0){
                    return false;
                }
            }
            return true;
        }
        
}