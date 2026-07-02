class Solution {
    public int compareVersion(String v11, String v22) 
    {
        String[] v1=v11.split("\\.");
        String[] v2=v22.split("\\.");
        if(v1.length==1 && v2.length==1)
        {
            return 0;
        }
        int i=0;
        int j=0;
        int a1=1;
        int b1=1;
        while(i<v1.length)
        {
            a1=(a1*10)+Integer.parseInt(v1[i]);
            i++;
        }
        while(j<v2.length)
        {
            b1=(b1*10)+Integer.parseInt(v2[j]);
            j++;
        }
        if(a1%10==0 && b1%10==0)
        {
            return 0;
        }
        else if(a1<b1)
        {
            return -1;
        }
        else if(a1>b1)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}