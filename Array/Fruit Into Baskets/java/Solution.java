class Solution {
    public int totalFruit(int[] f) 
    {
        int r=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int l=0;l<f.length;l++)
        {
            map.put(f[l],map.getOrDefault(f[l],0)+1);
            while(map.size()>2)
            {
               map.put(f[r],map.getOrDefault(f[r],0)-1);
               if(map.getOrDefault(f[r],0)==0)
               {
                map.remove(f[r]);
               }
               r++;
            }
            count=Math.max(count,(l-r+1));
        } 
        return count;   
    }
}