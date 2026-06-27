class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        int power=(int)Math.pow(2,n);
        List<List<Integer>> kavin=new ArrayList<>();
        int count=0;
        while(count<power){
            List<Integer> hem=new ArrayList<>();
            int temp=0;
            while(temp<n){
                if(((1<<temp)&(count))!=0){
                    hem.add(nums[temp]);
                }
                temp++;
            }
            kavin.add(hem);
            count++;
        }
        return kavin;
    }
}