class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        if(n==0)
        {
            return false;
        }
        HashSet<Integer> set=new HashSet<>();
        set.add(nums[0]);
        for(int i=1;i<n;i++)
        {
            if(set.contains(nums[i]))
            {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
        // Arrays.sort(nums);
        // while(right<n)
        // {
        //     if(nums[left]==nums[right])
        //     {
        //         return true;
        //     }
        //     left++;
        //     right++;
        // }
        // return false;
    }
}