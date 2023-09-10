class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> temp=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                temp.add(nums[i]);
            }
        }
        for(int i=0;i<temp.size();i++){
            nums[i]=temp.get(i);
        }
        for(int i=temp.size();i<nums.length;i++){
            nums[i]=0;
        }
    }
}