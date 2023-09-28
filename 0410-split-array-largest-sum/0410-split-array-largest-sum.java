class Solution {
    public int minimumLargestSum(int[] nums,int n,int explargest ){
     int res=1, actualSum=0;
     for(int i=0;i<n;i++){
         if(actualSum + nums[i]<=explargest){
             actualSum+=nums[i];
         }
         else{
             res++;
             actualSum=nums[i];
         }
     }
    return res; 
    }
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
         if(k>n){
            return -1;
        }
        // max which will be treated as low in this problem
        int max=Integer.MIN_VALUE;
        //sum which will be treated as high in this problem
        int sum=0;
        for (int i = 0; i <n; i++) {
            max = Math.max(max, nums[i]);
            sum+=nums[i];
        }
        
        while(max<=sum){
          int mid= max+(sum-max)/2;
            int res =minimumLargestSum(nums,n,mid);
            if(res<=k){
                sum=mid-1; 
            }
            else{
                max=mid+1;
            }
        }
    return max;
    }
}