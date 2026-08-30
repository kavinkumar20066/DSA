class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1) return 1;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int minimum=0;
        int maximum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i])
            {
                max=nums[i];
                maximum=i;
            }
            if(min>nums[i])
            {
                min=nums[i];
                minimum=i;
            }
        }
        if(Math.abs(minimum-maximum)==1)
        {
            int y=0;
            y=maximum+1;
            min=Math.min(y,nums.length-minimum);
            return min;
        }
        int[] array=new int[nums.length+nums.length];
            int val=0;
            for(int i=0;i<array.length;i++)
            {
                array[i]=nums[val];
                val++;
                if(val>nums.length-1)
                {
                    val=0;
                }
            }
            for(int i=0;i<array.length;i++)
            {
                
            }
             if(minimum>maximum)
        {
            int temp=minimum;
            minimum=maximum;
            maximum=temp;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("min="+minimum + "   =>  max="+maximum);
        return 0;
    }
}