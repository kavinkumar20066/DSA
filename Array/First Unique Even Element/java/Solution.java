class Solution {
    public int firstUniqueEven(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(nums[i],max);
        }
        int[] arr=new int[max+1];
        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]]++;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0 && arr[i]==1)
            {
                return i;
            }
        }
        return -1;
    }
}