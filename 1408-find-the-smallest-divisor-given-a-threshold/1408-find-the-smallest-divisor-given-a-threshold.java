class Solution {
    public int divisible(int[] nums , int divisor){
        int sum=0;
        for(int i=0;i<nums.length;i++){
         sum+=Math.ceil((double)(nums[i])/(double)(divisor));
        }
    return sum;    
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 0, high = Integer.MIN_VALUE;
        for (int i = 0; i <nums.length; i++) {
            high = Math.max(high, nums[i]);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int minDivisor=divisible(nums,mid);
            if(threshold>=minDivisor){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
    return low;    
    }
}