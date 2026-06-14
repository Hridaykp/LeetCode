class Solution:
    def checkGoodInteger(self, n: int) -> bool:
        sm =  sq = 0
        while n != 0:
            sm += n % 10
            sq += pow(n % 10, 2)
            n //= 10
         
        return sq - sm >= 50
        