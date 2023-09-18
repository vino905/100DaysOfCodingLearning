class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Map<Integer,Integer> resMap = new HashMap<>();
        int min =((nums.length/3) + 1);
        for(int i=0;i<nums.length;i++){
            int val=resMap.getOrDefault(nums[i],0);
            resMap.put(nums[i],val+1);

            if(resMap.get(nums[i])==min){
                res.add(nums[i]);
            }
            if(res.size()==2){
                break;
            }
        }
    return res;    
    }
}