class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] len=new int[nums1.length+nums2.length];
        int j=0;
        for(int i=0;i<len.length;i++){
            if(i<nums1.length){
                len[i]=nums1[i];
            }
            else{
                len[i]=nums2[j++];
            }
        }
        Arrays.sort(len);
       if(len.length%2!=0){
        double k=len[len.length/2];
        return k;
       }
       else {
        int k4=len.length/2;
        int k1=len[k4];
        int k2=len[k4-1];
        double k3=(k1+k2)/2.0;
        return k3;
       }
    }
}