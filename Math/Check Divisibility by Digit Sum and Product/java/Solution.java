class Solution {
    public boolean checkDivisibility(int n) {
        int number=n;
        int mult=1;
        int sum=0;
        while(n!=0)
        {
            int rem=n%10;
            sum=sum+rem;
            mult=mult*rem;
            n=n/10;
        }
        if((mult+sum)==number)
        {
            return true;
        }
        return false;
    }
}