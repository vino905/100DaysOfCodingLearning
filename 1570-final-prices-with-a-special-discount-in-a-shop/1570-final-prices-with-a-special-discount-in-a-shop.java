class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>prices[i]){
               st.pop();
            }
            if(st.peek()==-1){
                ans[i]=prices[i];
            }
            else{
                ans[i]=prices[i]-st.peek();
            }  
            st.push(prices[i]);
            }
        
    return ans;    
    }
}