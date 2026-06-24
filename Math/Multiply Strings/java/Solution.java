class Solution
 {
    public String multiply(String num1, String num2) 
    {
        int sum=0;
       return multiple(num1, num2, 0);
    }
    static String multiple(String num1, String num2,int sum)
    {
        if(num1.length()==0)
        {
             StringBuffer str = new StringBuffer();
        str.append(sum);
            return str.toString();
        }
        int power=((int)Math.pow((int)10,num1.length()-1))*(num1.charAt(0)-'0');
        int power2=(int)power*(Integer.valueOf(num2));
        return multiple(num1.substring(1),num2,sum+power2);
    }
 }