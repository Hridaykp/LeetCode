class Solution:
    def elevatorRequests(self, n: int, requests: list[int]) -> int:
        res = requests[0]
        for i in range(1, len(requests)):
            if requests[i] != requests[i-1]:
                res += abs(requests[i]-requests[i-1])
        return res