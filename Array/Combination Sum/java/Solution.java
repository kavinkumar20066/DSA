class Solution {
    public List<List<Integer>> combinationSum(int[] can, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> innerlist=new ArrayList<>();
        int indx=0;
        int n=can.length;
        findcombo(innerlist,list,can,indx,target,n);
        return list;
    }
    public static void findcombo(List<Integer> innerlist , List<List<Integer>> list, int[] can,int indx,int target,int n)
    {
        if(indx==n)
        {
            if(target==0)
            {
                list.add(new ArrayList<>(innerlist));
            }
            return;
        }
        if(can[indx]<=target)
        {
            innerlist.add(can[indx]);
            findcombo(innerlist,list,can,indx,target-can[indx],n);
            innerlist.remove(innerlist.size()-1);
        }
        findcombo(innerlist,list,can,indx+1,target,n);
    }
}