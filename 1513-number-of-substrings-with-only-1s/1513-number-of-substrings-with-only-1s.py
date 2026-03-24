class Solution:
    def numSub(self, s: str) -> int:
        n = len(s)
        if n == s.count("1"):
            return n*(n+1)//2
        cons_1s, count = [], 0
        for ch in s:
            if ch == '1':
                count += 1
            else:
                if count > 0:
                    cons_1s.append(count)
                    count = 0 
        if count > 0: cons_1s.append(count) 
        res = 0
        for n in cons_1s:
            res += n*(n+1)//2     
        return res % (10**9+7)