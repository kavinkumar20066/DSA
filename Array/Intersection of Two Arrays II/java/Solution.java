class Solution 
{
    public int[] intersect(int[] n1, int[] n2) 
    {
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n1.length;i++)
        {
            map.put(n1[i],map.getOrDefault(n1[i],0)+1);
        }
        for(int i=0;i<n2.length;i++)
        {
            if( map.containsKey(n2[i]) && map.get(n2[i])!=0 )
            {
                list.add(n2[i]);
                map.put(n2[i],map.getOrDefault(n2[i],0)-1);
            }
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=list.get(i);
        }
        return arr;
    }
}