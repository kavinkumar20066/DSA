class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        val=int(num/2)
        left=0
        right=val
        while left<=right:
            mid=(left+right)//2
            if (mid*mid)==num:
                return True
            elif (mid*mid)<num:
                left=mid+1
            elif (mid*mid)>num:
                right=mid-1
        return False


        