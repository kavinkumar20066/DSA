class Solution:
    def findShortestSubArray(self, nums: List[int]) -> int:
        d={}
        maxfrequency=0
        for i in range(len(nums)):
            if nums[i] not in d:
                d[nums[i]]=[]
            d[nums[i]].append(i)
            maxfrequency=max(len(d[nums[i]]),maxfrequency)
        left=-1
        right=-1
        for i in range(len(nums)):
            if len(d[nums[i]])!=maxfrequency:
                continue
            elif left==-1 and right==-1:
                left=d[nums[i]][0]
                right=d[nums[i]][len(d[nums[i]])-1]
            else:
                first=d[nums[i]][0]
                last=d[nums[i]][len(d[nums[i]])-1]
                if (last-first+1)<(right-left+1):
                    left=first
                    right=last
        return right-left+1
