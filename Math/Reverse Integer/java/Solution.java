class Solution 
{
    public int reverse(int x) 
    {
        int sum=0;
        int result=func(sum,x);
        return result;
    }
    public static int func(int sum,int x)
    {
        if(x==0)
        {
            return sum;
        }
        sum=sum*10+x%10;
        return func(sum,x/10);
    }
}