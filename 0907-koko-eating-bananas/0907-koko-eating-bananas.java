class Solution {
    public int largest(int[] arr ){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
    return max;    
    }
    public int minHourNeeded(int [] piles,int hour){
        int ans=0;
        int n=piles.length;
        for(int i=0;i<n;i++){
            ans+=Math.ceil((double)(piles[i])/(double)(hour));
        }
        return ans;
    }
    public int minEatingSpeed(int[] piles, int h) {
        
        int max=largest(piles);
        int low=1;
        int high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            int ans = minHourNeeded(piles,mid);

            if(h>=ans){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
    return low;    
    }
}