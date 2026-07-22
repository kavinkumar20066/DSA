class Solution:
    def check(self, nums: List[int]) -> bool:
        countfirst=0
        for i in range(len(nums)-1):
            if nums[i]<=nums[i+1]:
                countfirst+=1
            else:
                break
        if countfirst==len(nums)-1:
            return True
        if nums[0]<nums[len(nums)-1]:
            return False
        count=0
        for i in range(len(nums)-1):
            if nums[i]<=nums[i+1] and count<2:
                continue
            elif nums[i]>nums[i+1] and count<2:
                count+=1
            else:
                return False
        return True

        