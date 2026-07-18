class Solution {
    public int canCompleteCircuit(int[] g, int[] c) {
        int sumg=0;
        int sumc=0;
        int sum=0;
        int k=0;
     for(int i=0;i<g.length;i++)
     {
        sumg+=g[i];
        sumc+=c[i];
     }   
      if(sumg<sumc)
     {
        return -1;
     }
     for(int i=0;i<g.length;i++)
     {
      k++;  
        if(g[i]>=c[i])
        {
        sum+=g[i];
        sum=sum-c[i];
        }
        else if(sum<c[i])
        {
            k=1;
        }
     }
     return k;
    }
}