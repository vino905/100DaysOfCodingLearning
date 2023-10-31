class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int i=0;
        int j=0;
        int cnt=0;
        int n=nums.length;
        int sum=0;
        int k=0;
        int s=0;
        while(j<n){
            sum+=nums[j];
            while(sum>goal){
                sum-=nums[i];
                i++;
            }  
            k=i;
            if(sum==goal){
                 s=sum;
            }
            while(s==goal && k<=j){
                s-=nums[k];
                k++;
                cnt++;
            }
        j++;  
        }
      return cnt;
    }
}