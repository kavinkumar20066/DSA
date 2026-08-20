class Solution {
    public List<List<Integer>> combinationSum2(int[] can, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> innerlist=new ArrayList<>();
        Arrays.sort(can);
        int indx=0;
        int n=can.length;
        findcombo(innerlist,list,can,indx,target,n);
        return list;
    }
    public static void findcombo(List<Integer> innerlist, List<List<Integer>> list, int[] can,int indx,int target,int n)
    {
            if(target==0)
            {
                list.add(new ArrayList<>(innerlist));
                return;
            }
        for(int i=indx;i<can.length;i++)
        {
            if(i>indx && can[i]==can[i-1]) continue;
            if(can[i]>target) break;
            innerlist.add(can[i]);
            findcombo(innerlist,list,can,i+1,target-can[i],n);
            innerlist.remove(innerlist.size()-1);
        }
    }
}