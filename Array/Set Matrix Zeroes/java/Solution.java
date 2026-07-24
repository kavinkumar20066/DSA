class Solution {
    public void setZeroes(int[][] m) {
        int[][] a=new int[m.length][m[0].length];
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[i].length;j++)
            {
                a[i][j]=m[i][j];
            }
        }
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[i].length;j++)
            {
                if(a[i][j]==0)
                {
                    make(i,j,m);
                }
            }
        }
    }
    static void make(int i,int j,int[][] m)
    {
        int count=0;
        int count2=0;
        while(count!=m[i].length)
        {
            m[i][count]=0;
            count++;
        }
        while(count2!=m.length)
        {
            m[count2][j]=0;
            count2++;
        }
    }
}