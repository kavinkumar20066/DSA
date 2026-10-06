class Solution {
    public void reverseString(char[] s) 
    {
        int left=0;
        int right=s.length-1; 
        func(left,right,s);
    }
    public static void func(int left,int right,char[] s)
    {
        if(left>=right)
        {
            return;
        }
        char temp=s[left];
        s[left]=s[right];
        s[right]=temp;

        func(left+1,right-1,s);
    }

}