//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    
    boolean knows(int M[][],int a,int b ,int n){
        if(M[a][b]==1){
            return true;
        }
    return false;    
    }
    int celebrity(int M[][], int n)
    {
    	Stack<Integer> st=new Stack<>();
    	
    	for(int i=0;i<n;i++){
    	    st.push(i);
    	}
    	int a=0;
    	int b=0;
    	while(st.size()>1){
    	        a=st.pop();
    	        b=st.pop();
    	
    	
    	if(knows(M,a,b,n)){
    	    st.push(b);
    	}
    	else{
    	    st.push(a);
    	}
    }
    	int ans=st.peek();
    	
    	int zeroCnt=0;
    	
    	for(int i=0;i<n;i++){
    	    if( M[ans][i]==0){
    	        zeroCnt++;
    	    }
    	}
    	
    	if(zeroCnt!=n){
    	    return -1;
    	}
    	
    	int oneCnt=0;
    	
    	for(int i=0;i<n;i++){
    	    if( M[i][ans]==1){
    	        oneCnt++;
    	    }
    	}
    	
    	if(oneCnt!=n-1){
    	    return -1;
    	}
    return ans;	
    }
}