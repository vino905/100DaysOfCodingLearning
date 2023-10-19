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
    public int rectangleArea(int[] heights) {
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
    public int maximalRectangle(char[][] matrix) {
     
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        int[] arr = new int[numCols];
        for(int i=0;i<numCols;i++){
            arr[i]=matrix[0][i]-'0';
        }
        int area=rectangleArea(arr);

        for (int i = 1; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                  if(matrix[i][j]!='0'){
                      arr[j]+=matrix[i][j]-'0';
                  }
                  else{
                      arr[j]=0;
                  }
            }
                area=Math.max(area,rectangleArea(arr));  
        }
    return area;    
    }
}