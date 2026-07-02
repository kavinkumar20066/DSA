class Solution {
    public int compareVersion(String v11, String v22) 
    {
        String[] v1=v11.split("\\.");
        String[] v2=v22.split("\\.");
        int i=0;
        int j=0;
        while(i<v1.length && j<v2.length)
        {
            int a1=Integer.parseInt(v1[i]);
            int b1=Integer.parseInt(v2[j]);
            if(a1<b1)
            {
                return -1;
            }
            else if(a1>b1)
            {
                return 1;
            }
            i++;
            j++;
        }
        while(i<v1.length)
        {
            if(Integer.parseInt(v1[i])!=0)
            {
                return 1;
            }
            i++;
        }
        while(j<v2.length)
        {
            if(Integer.parseInt(v2[i])!=0)
            {
                return -1;
            }
            j++;
        }
        return 0;
    }
}