class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> res=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            int need=target-a;
            if(res.containsKey(need)){
                return new int[]{res.get(need),i};
            }
          res.put(nums[i],i);  
        }
    return new int[] {-1,-1};    
    }
}