class Solution {
public:
    int reverseDegree(string s) {
       // cout<<(int)'a'-96;
        int val=0;
        int num=0;
        for(int i=0;i<s.size();i++)
        {
            val=(int)s[i]-96;
            int num1=27-val;
            num=num+(num1*(i+1));
        }
            return num;

    }
};