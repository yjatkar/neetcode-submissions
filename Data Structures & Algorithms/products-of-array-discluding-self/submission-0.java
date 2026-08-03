class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int res=1;
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    res=res*nums[j];
                }
            }
            ans[i]=res;
        }
        return ans;
        
    }
}  
