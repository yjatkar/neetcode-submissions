class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int i=1;
        while(i<n)
        {
            if(nums[i]==nums[i-1])
            {
                return true;
            }
            i++;
        }
        return false;
        

    }
}