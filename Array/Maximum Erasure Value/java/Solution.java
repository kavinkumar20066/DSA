class Solution {
    public int maximumUniqueSubarray(int[] n) 
    {
        int right=0;
        int max=0;
        int sum=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n.length;i++)
        {
            while(!set.isEmpty() && set.contains(n[i]))
            {
                set.remove(n[right]);
                sum=sum-n[right];
                right++;
            }
            set.add(n[i]);
            sum=sum+n[i];
            max=Math.max(sum,max);
        }
        return max;
    }
}