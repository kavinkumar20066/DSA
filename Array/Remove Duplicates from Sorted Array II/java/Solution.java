class Solution {
    public int removeDuplicates(int[] n) {
        int k=2;
        int r=0;
        int count=0;
        int[] arr=new int[n];
        for(int l=0;l<n.length;l++)
        {
            if(n[l]!=n[r])
            {
                if((l-r)>=2)
                {
                    count=count+2;
                    r=l;
                }
                else
                {
                    count++;
                }
            }
        }
        return count;
    }
}