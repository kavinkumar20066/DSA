class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr={-1,-1};
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                arr[1]=i;
                if(j==0)
                {
                    arr[0]=i;
                    arr[1]=i;
                }
                j++;
            }
        }
        return arr;
    }
}