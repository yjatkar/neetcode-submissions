class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        unique=set(nums)
        tot_len=len(nums)
        if len(unique)==tot_len:
            return False
        else:
            return True
        
        