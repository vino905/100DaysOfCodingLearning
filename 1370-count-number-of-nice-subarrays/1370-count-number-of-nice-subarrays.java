class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int i=0,j=0;
        int n=nums.length;
        int ans=0,cnt=0,oddCnt=0;
        while(j<n){
            if(nums[j]%2==1){
                oddCnt++;
                cnt=0;
            }
            while(oddCnt==k){
                if(nums[i]%2==1)
                   oddCnt--;
                cnt++;
                i++;
            }
        ans+=cnt;
        j++;    
        }
    return ans;

    }
}