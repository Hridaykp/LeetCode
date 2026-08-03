class Solution:
    def countRatioSubarrays(self, nums: list[int], a: int, b: int) -> int:
        count = 0
        for i in range(len(nums)):
            even = odd = 0
            for j in range(i, len(nums)):
                if nums[j]&1 == 1:
                    odd += 1
                else:
                    even += 1
                if odd > 0 and b*even <= a*odd:
                    count += 1
        return count 