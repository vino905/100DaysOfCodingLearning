class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> h =new PriorityQueue<Integer>();
        
        for(int i=0;i<nums.length;i++){
            h.add(nums[i]);
            if(h.size()>k){
                h.poll();
            }
        }
        
     return h.peek();
        
    }
}