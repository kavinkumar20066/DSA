class Solution {
    public boolean isPerfectSquare(int j) {
        if(j==1||j==2) return true;
        boolean is=false;
        if(j%2==0)
        {
        for(int i=1;i<=j/2;i++)
        {
            if(i*i==j)
            {
                is=true;
                break;
            }
        }
        }
    return is;
    }
}