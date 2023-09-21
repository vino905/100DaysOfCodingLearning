class Solution {
    public int[] searchRange(int[] nums, int target) {

        int n= nums.length;
        int ans1=-1;
        int low=0;
        int high=n-1;

        while(high>=low){
          int mid= low + (high-low)/2;

          if(nums[mid]==target){
              ans1=mid;
              high=mid-1;
          }
          else if(target>nums[mid]){
              low=mid+1;
          }
          else{
              high=mid-1;
          }
        }
       if(ans1==-1){
           int[] res = new int[] { -1, -1 };
           return res;
       } 
       int ans2=ans1;
       low=0;
       high=n-1;

        while(high>=low){
          int mid= low + (high-low)/2;

          if(nums[mid]==target){
              ans2=mid;
              low=mid+1;
          }
          else if(target>nums[mid]){
              low=mid+1;
          }
          else{
              high=mid-1;
          }
        }
    int[] res = new int[] { ans1, ans2 };    
    return res;
    }
}