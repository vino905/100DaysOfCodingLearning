class Solution {

    public boolean leastWeightCapacity(int []weights,int days,int expectedLWC){

        int cnt=0;
        int actualDays=1;
        int load=0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>expectedLWC){
                actualDays++;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }

        }
    return actualDays>days ? false:true; 
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE;
        int high=0;

        for (int i = 0; i <weights.length; i++) {
            low = Math.max(low, weights[i]);
            high+=weights[i];
        }
        
        while(low<=high){
          int mid= low+(high-low)/2;
          if(leastWeightCapacity(weights,days,mid)){
              high=mid-1;
          }
          else{
              low=mid+1;
          }
        }
    return low;    
    }
}