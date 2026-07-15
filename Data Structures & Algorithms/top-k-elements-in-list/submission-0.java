class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[]=new int[k];
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],1);
            }
            else
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
        }

        // Max Heap
        PriorityQueue<Map.Entry<Integer,Integer>> pq=
        new PriorityQueue<>((a,b)->Integer.compare(b.getValue(),a.getValue()));
        
        pq.addAll(map.entrySet());
        // int[] ans = new int[k];

        for(int i=0;i<k;i++){
            ans[i]=pq.poll().getKey();
        }
        return ans;
    }
}
