class Solution:
    def findMin(self, nums: List[int]) -> int:
        left=0
        right=len(nums)-1
        small=sys.maxsize
        while left<=right:
            mid=(left+right)//2
            if nums[left]<=nums[mid]:
                small=min(small,nums[left])
                left=mid+1
            else:
                small=min(small,nums[mid])
                right=mid-1
        return small
            