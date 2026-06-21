class Solution {
    public int romanToInt(String s) {
    int I=1;
    int V=5;
    int X=10;
    int L=50;
    int C=100;
    int D=500;
    int M=1000;
    int val=0;
    for(int i=0;i<s.length()-1;i++){
        if(s.charAt(i)<s.charAt(i+1)){
            val=s.charAt(i)-s.charAt(i+1);
        }
    }
    }
}