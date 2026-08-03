class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n=len(nums)
        ans=[1]*n
        for i in range(n):
            res=1
            for j in range(n):
                if (i!=j):
                    res=res*nums[j]
            
            ans[i]=res
        
        return ans
