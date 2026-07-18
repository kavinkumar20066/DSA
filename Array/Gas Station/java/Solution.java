class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) 
    {
        int gascount=0;
        int costcount=0;
        for(int i=0;i<gas.length;i++)
        {
            gascount+=gas[i];
            costcount+=cost[i];
        }
        if(gascount<costcount){
            return -1;
        }
        int index=0;
        int val=0;
        for(int i=0;i<gas.length;i++)
        {
            val=(gas[i]-cost[i])+val;
            if(val<0)
            {
                index=i+1;
                val=0;
            }
        }
        return index;    
    }
}