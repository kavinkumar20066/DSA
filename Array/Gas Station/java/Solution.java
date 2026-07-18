class Solution {
    public int canCompleteCircuit(int[] g, int[] c) {
        int g1=0;
        int c1=0;
        for(int i=0;i<c.length;i++)
        {
            c1+=c[i];
            g1+=g[i];
        }
        if(g1<c1)
        {
            return -1;
        }
    int t=0;
    for(int i=0;i<g.length-1;i++)
    {
        int h=g[i];
        if(g[i]>=c[i])
        {
            int n=g[i]-c[i];
            h+=n;
        }
        else
        {
            t=i;
            g[i]=0;
        }
    }
    return t+1;
    }
}