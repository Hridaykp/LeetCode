class Solution:
    def checkGoodInteger(self, n: int) -> bool:
        def digitSum(n: int) -> int:
            sm = 0
            while n != 0:
                sm += n % 10
                n //= 10
            return sm
        def digitSqrSum(n: int) -> int:
            sq = 0
            while n != 0:
                sq += pow(n % 10, 2)
                n //= 10
            return sq
        return digitSqrSum(n) - digitSum(n) >= 50
        