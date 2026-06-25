class Solution {
    public int totalFruit(int[] f) 
    {
        int r=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int l=0;l<f.length;l++)
        {
            map.put(f[l],map.getOrDefault(f[l],0)+1);
            count++;
            while(map.size()>2)
            {
                count=count-map.getOrDefault(f[l],0);
                map.remove(f[r]);
                r++;
            }
        } 
        return count;   
    }
}