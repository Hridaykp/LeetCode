class Solution:
    def countDigitOccurrences(self, nums: list[int], digit: int) -> int:
        count = 0
        for num in nums:
            temp = str(num)
            for c in temp:
                # print(c, digit)
                if c == str(digit):
                    count += 1
        return count