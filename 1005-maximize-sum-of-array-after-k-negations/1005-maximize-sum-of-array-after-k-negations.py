class Solution:
    def largestSumAfterKNegations(self, nums: List[int], k: int) -> int:
        nums = sorted(nums)
        for i in range(len(nums)):
            if nums[i] < 0 and k > 0:
                nums[i] = -nums[i]
                k -= 1
            elif nums[i] > 0:
                if k&1 == 0:
                    return sum(nums)
                else:
                    nums = sorted(nums)
                    return sum(nums) - 2 * nums[0]
            else:
                while k > 0:
                    k -= 1

        if k>0:
            return self.largestSumAfterKNegations(nums, k)
        return sum(nums)
