class Solution:
    def passwordStrength(self, password: str) -> int:
        res = 0
        set_ = set(password)
        for ch in set_:
            if ord(ch) in range(97, 123):
                res += 1
            elif ord(ch) in range(65, 91):
                res += 2
            elif ch in "0123456789":
                res += 3
            else:
                res += 5
        return res
        