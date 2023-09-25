class Solution {
    public boolean kThPositiv(int []arr,int target){
        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid= low +(high-low)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
    return false;    
    }
    public int findKthPositive(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        int cnt = 0;
        for (int i = 0; i <arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        for(int i=1;i<=max+k+1;i++){
            if(cnt==k){
                return i-1;
            }
            if(kThPositiv(arr,i)){
                continue;
            }
            else{
                cnt++;
            }
        }
    return -1;    
    }
}