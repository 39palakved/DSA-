class Compute
{
    String average(int A[], int N)
    {
     float total = 0;
        for(int num: A){
            total += num;
        }
        float f = total/N;
        return String.format("%.2f", f);   
    }
}