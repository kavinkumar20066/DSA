class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        int indx=0;
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> listinner=new ArrayList<>();
        func(indx,list,listinner,n,nums);
        return list;        
    }
    public static void func(int indx,List<List<Integer>>list,List<Integer> listinner,int n,int[] nums)
    {
    if(indx>=n)
        {
            list.add(new ArrayList<>(listinner));
            return;
        }
        listinner.add(nums[indx]);
        func(indx+1,list,listinner,n,nums);
        listinner.remove(listinner.size() - 1);
        func(indx+1,list,listinner,n,nums);
    }
}