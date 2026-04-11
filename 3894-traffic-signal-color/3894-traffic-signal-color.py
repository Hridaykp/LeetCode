class Solution:
    def trafficSignal(self, timer: int) -> str:
        # if 90 < timer < 30 and not 0: return "Invalid"
        if timer == 0: return "Green"
        if timer == 30: return "Orange"
        if 30 < timer <= 90: return "Red"
        return "Invalid"
