class Solution {
    public int numSubarrayProductLessThanK(int[] n, int k) 
    {
        int sum=1;
        int count=0;
        for(int i=0;i<n.length;i++)
        {
            sum=sum*n[i];
            if(n[i]<k)
            {
                count++;
            }
            if(sum<k && i>0)
            {
                count++;
            }
        }
        for(int j=0;j<n.length-1;j++)
        {
            sum=sum/n[j];
            if(sum<k)
            {
                count++;
            }
        }
        return count;
    }
}