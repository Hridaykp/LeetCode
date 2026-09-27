class Solution:
    def rearrangeArray(self, nums: list[int]) -> list[int]:
        freq = Counter(sorted(nums))
        ans = []
        
        while freq:
            ans.extend(list(freq))
            freq.subtract(list(freq))
            freq += Counter()
        return ans
