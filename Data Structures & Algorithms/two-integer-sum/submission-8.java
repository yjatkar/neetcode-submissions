class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int val=0;
        for(int i=0;i<n;i++)
        {
            val=target-nums[i];
            if (map.containsKey(val)){
                return new int[]{map.get(val),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
        
    }
}
