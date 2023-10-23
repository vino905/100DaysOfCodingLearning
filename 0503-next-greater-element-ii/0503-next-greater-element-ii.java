class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int nums_len=nums.length;
        int[] ans=new int[nums_len];
        Stack<Integer> st=new Stack<>();

        for(int i=(2*nums_len)-1;i>=0;i--){
            int curr=nums[i%nums_len];
            while(!st.isEmpty() && curr>=st.peek()){
                st.pop();
            }
            if(i<nums_len){
                if(st.isEmpty()){
                    ans[i]=-1;
                }
                else{
                ans[i]=st.peek();
                }
            }
        st.push(nums[i%nums_len]);    
        }
    return ans;    
    }
}