class Solution {
    public int[] nextSmallest(int[] arr, int n)
    { 
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        int[] ans=new int[n];
        
        for(int i=n-1;i>=0;i--){
            int curr=arr[i];
            while(st.peek()!=-1 && curr<=arr[st.peek()]){
                st.pop();
            }
            ans[i]=st.peek();
            st.push(i);
        }
    return ans;    
    } 

   public  int[] prevSmallest(int [] arr, int n)
     { 
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        int[] ans=new int[n];
        
        for(int i=0;i<n;i++){
            int curr=arr[i];
            while(st.peek()!=-1 && curr<=arr[st.peek()]){
                st.pop();
            }
            ans[i]=st.peek();
            st.push(i);
        }
    return ans;    
    }
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] next=new int[n];
        next=nextSmallest(heights,n);

        int[] prev=new int[n];
        prev=prevSmallest(heights,n);
        int area=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int l=heights[i];
            if(next[i]==-1){
                next[i]=n;
            }
            int b=next[i]-prev[i]-1;
            area=Math.max((l*b),area);
        }
    return area;    
    }
}