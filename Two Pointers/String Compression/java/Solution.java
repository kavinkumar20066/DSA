class Solution {
    public int compress(char[] chars) 
    {
        StringBuilder sb=new StringBuilder();
        int r=0;
        for(int l=0;l<chars.length;l++)
        {
            if(chars[l]!=chars[r])
            {
                sb.append(chars[r]);
                if((l-r)!=1)
                {
                sb.append((l-r));
                }
                r=l;
            }
        }
        sb.append(chars[r]);
        if(((chars.length-1)-r) +1 !=1)
        {
        sb.append( ((chars.length-1)-r) +1); 
        }
        System.out.println(sb.toString());
        for(int i=0;i<sb.length();i++)
        {
            chars[i]=sb.charAt(i);
        }
        return sb.length();
    }
}