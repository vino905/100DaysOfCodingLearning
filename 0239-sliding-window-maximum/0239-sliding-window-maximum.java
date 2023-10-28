class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int s=n-k+1;
        int [] ans=new int[s];
        Deque<Integer> q = new LinkedList<>();
        int i=0;
        int j=0;

        while(j<n){

         while(!q.isEmpty() && q.peekLast() < nums[j]){
             q.removeLast();
         }
         q.add(nums[j]);

         if(j-i+1>=k){
             ans[i]=q.peekFirst();

             if(nums[i]==q.peekFirst()){
                 q.pop();
             }
             i++;
         }
        j++; 
        }
    return ans;    
    }
}