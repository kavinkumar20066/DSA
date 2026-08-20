class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
       for(int indx=0;indx<nums.length;indx++)
       {
            if(indx==0)
            {
                list.add(nums[indx]);
            }
            else if(indx==1)
            {
                list2.add(nums[indx]);
            }
            else if(list.get(list.size()-1)>list2.get(list2.size()-1))
            {
                list.add(nums[indx]);
            }
            else
            {
                list2.add(nums[indx]);
            }
       } 
       int[] array=new int[nums.length];
       int y=0;
       for(int i=0;i<array.length;i++)
       {
            if(i<list.size())
            {
                array[i]=list.get(i);
            }
            else
            {
                array[i]=list2.get(y);
                y++;
            }
       }
       return array;
    }
}