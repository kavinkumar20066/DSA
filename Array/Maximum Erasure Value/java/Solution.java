class Solution {
    public int maximumUniqueSubarray(int[] n)
    {
        TreeSet<Integer> set=new TreeSet<>();
        int sum=0;
        for(int i=0;i<n.length;i++)
        {
            set.add(n[i]);
        }   
        for(Integer k:set)
        {
            sum+=k;
        }
        return sum;
    }
}