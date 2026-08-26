class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dict_1={}
        for i,num in enumerate(nums):
            val=target-num
            if val in dict_1:
                return [dict_1[val],i]
            dict_1[num]=i
        
        return []

        