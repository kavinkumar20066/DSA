class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        list2=[]
        ans=0
        for i in range(len(nums)):
            ans=nums[i]+ans
            list2.append(ans)
        return list2