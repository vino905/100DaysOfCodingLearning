class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        subSet(ans, nums, temp, 0);
        return ans;
    }
    void subSet(List<List<Integer>> ans, int[] nums, List<Integer> temp, int i){
        if(i==nums.length){
            List<Integer> op = new ArrayList<>(temp);
            Collections.sort(op);
            if(!ans.contains(op)){
                ans.add(op);
            }
            return;
        }
        temp.add(nums[i]);
        subSet(ans, nums, temp, i+1);
        temp.remove(temp.size()-1);
        subSet(ans, nums, temp, i+1);
        return;
    }
}