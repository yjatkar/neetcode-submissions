class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        // int ans[]=new int[2];
        int num=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            num=target-nums[i];
            if(map.containsKey(num))
            {
                // ans[0]=map.get(num);
                // ans[1]=i;
                 return new int[]{map.get(num), i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};








        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         if(i!=j && nums[i]+nums[j]==target)
        //         {
        //             ans[0]=i;
        //             ans[1]=j;
        //         }
        //     }
        // }
        // return ans;
        
    }
}
