class Compute 
{
    public long[] minAnd2ndMin(long a[], long n)  
    {
        Arrays.sort(a);
        long l[]=new long[]{-1,-1};
        if(n==1)
        {
            return new long[]{-1};
        }
        if(a[0]!=a[1])
        {
            l[0]=a[0];
            l[1]=a[1];
        }
        else if(a[0]==a[1])
        {
            for(int i=2;i<n;i++)
            {
                if(a[i]!=a[0])
                {
                    l[0]=a[0];
                    l[1]=a[i];
                    break;
                }
            }
        }
        return l;
     }
}
