class Solution {
    public int jump(int[] nums) {
        
        int res=0;
        // This is for maintaing the window
        int l=0,r=0;
        while(r<nums.length-1){
            int jumpF=0;
            for(int i=l;i<=r;i++){
                jumpF=Math.max(jumpF,i+nums[i]);
            }
          l=r+1;
          r=jumpF;
          res+=1;  
        }
    return res;    
    }
}