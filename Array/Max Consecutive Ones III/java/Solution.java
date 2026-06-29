class Solution {
    public int longestOnes(int[] n, int k) 
    {
        int r=0;
        int cz=0;
        int max=0;
        for(int l=0;l<n.length;l++)
        {
            if(n[l]==0)
            {
                cz++;
            }
            if(cz>k)
            {
            while(n[r]!=0)
            {
                r++;
            }
            r++;
            cz--;
            }
            max=Math.max(((l-r)+1) , max);
        }
          return max;  
    }
}