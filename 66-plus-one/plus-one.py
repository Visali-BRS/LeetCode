class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        result = int("".join(map(str, digits)))
        result2=int(result+1)
        res = [int(digit) for digit in str(result2)]
        return res

        