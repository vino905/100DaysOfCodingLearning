class Solution {
    public boolean canJump(int[] nums) {
        int gp=nums.length-1;
        
        for(int i=nums.length-1;i>=0;i--){
            if(i+nums[i]>=gp){
                gp=i;
            }
        }
    return gp==0? true:false;    
    }
}