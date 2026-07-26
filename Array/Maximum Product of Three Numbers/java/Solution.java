class Solution {
    public int maximumProduct(int[] nums) 
    {
        if(nums.length==3)
        {
            return nums[0]*nums[1]*nums[2];
        }
        int max=0;
        int sum=1;
        int r=0;
        for(int l=0;l<nums.length;l++)
        {
            sum=nums[l]*sum;
            if(l>=3)
            {
                sum=sum/nums[r];
                r++;
            }
            max=Math.max(max,sum);
        }
        return max;
    }
}