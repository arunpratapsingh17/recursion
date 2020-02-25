
class Digital
{
    // complete the function
    public static int digitalRoot(int n)
    {
        int sum1=0;
        int sum=0;
        // add your code here
        if(n<10)
        {
            return(n);
        }
        while(n!=0)
        {
            sum=sum+n%10;
            n=n/10;
        }
        if(sum<10)
        {
            return sum;
        }
        else
        {
            sum1=sum;
            sum=0;
            return(digitalRoot(sum1));
        }
    }
}