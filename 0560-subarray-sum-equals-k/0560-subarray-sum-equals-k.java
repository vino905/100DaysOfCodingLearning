class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> res=new HashMap<>();
        res.put(0,1);
        int prefixSum=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            prefixSum+= nums[i];
            int need=prefixSum-k;
            cnt=cnt+ res.getOrDefault(need,0);
            res.put(prefixSum , (res.getOrDefault(prefixSum,0))+1);
        }
    return cnt;    
    }
}