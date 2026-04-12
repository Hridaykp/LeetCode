class Solution:
    def countDigitOccurrences(self, nums: list[int], digit: int) -> int:
        count = 0
        for num in nums:
            while num != 0:
                d = num % 10
                if d == digit:
                    count += 1
                num //= 10
        return count