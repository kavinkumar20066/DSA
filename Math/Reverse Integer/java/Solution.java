class Solution 
{
    public int reverse(int x) 
    {
        long sum=0;
        long result=func(sum,x);
        if(result >= Integer.MIN_VALUE && result <= Integer.MAX_VALUE)
        {
            return (int)result;
        }
        return 0;
    }
    public static long func(long sum,long x)
    {
        if(x==0)
        {
            return sum;
        }
        sum=sum*10+x%10;
        return func(sum,x/10);
    }
}