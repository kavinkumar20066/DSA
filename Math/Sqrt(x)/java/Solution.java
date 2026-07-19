class Solution {
    public int mySqrt(int x) 
    {
        if(x==0) return 0;
        int l=0;
        int h=x;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if((mid*mid)==x) return mid;
            else if((mid*mid)>x)
            {
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }   
        return h;
    }
}