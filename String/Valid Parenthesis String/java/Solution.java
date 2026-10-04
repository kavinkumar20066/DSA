class Solution {
    public boolean checkValidString(String s) 
    {
        Stack<Character> st=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char word=s.charAt(i);
            if(word==')' && !st.isEmpty() && st.peek()=='(' )
            {
                if(count!=0)
                {
                    count--;
                }
                st.pop();
            }
            else if(word=='(')
            {
                st.push(word);
            }
            else
            {
                count++;
            }
        } 
        System.out.println(st);
        if(count>=st.size())
        {
            return true;
        }   
        return false;
    }
}