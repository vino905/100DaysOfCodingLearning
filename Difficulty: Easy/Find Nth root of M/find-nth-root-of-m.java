//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            String[] S1 = s.split(" ");
            int n = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            Solution ob = new Solution();
            int ans = ob.NthRoot(n, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int helper(int mid , int n , int m){
        long ans = 1;
        
        for(int i=1;i<=n;i++){
            ans = ans * mid;
            if(ans>m){
                return 2;
            }
        }
        if(ans==m){
            return 1;
        }
    return 0;    
    }
    
    public int NthRoot(int n, int m)
    {
        // code here
        int low = 1;
        int high = m;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(helper(mid,n,m)==1){
                return mid;
            }
            else if (helper(mid,n,m)==0){
                low = mid+1;
            }
            
            else{
                high = mid-1;
            }
            
        }
    return -1;    
    }
}