class Solution:
    def nextGreaterElements(self, nums: List[int]) -> List[int]:
        res = []
        n = len(nums)
        for idx, num in enumerate(nums):
            i = 0
            nextGreater = -1
            while i <= idx:
                if nums[i]>num:
                    nextGreater = nums[i]
                    break
                else: i += 1
            j = idx + 1
            while j < n:
                if nums[j] > num:
                    nextGreater = nums[j]
                    break
                else: j += 1
                
            res.append(nextGreater)
                
        return res