class Solution:
    def numSubarrayProductLessThanK(self, nums: List[int], k: int) -> int:
        product=1
        sum=0
        left=0
        for i in range(len(nums)):
            product=product*nums[i]
            while product>=k and left<len(nums):
                product=product/nums[left]
                left=left+1
            sum=sum+((i-left)+1)
        return sum
        