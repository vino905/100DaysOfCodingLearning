class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int ans=0;
        int n=nums.length;
        int sum=0;
        while(j<n){
            sum+=nums[j];
            while(sum+k<(j-i+1)){
                sum-=nums[i];
                i++;
            }
        ans=Math.max(ans,(j-i+1));  
        j++;  
        }
    return ans;    
    }
}