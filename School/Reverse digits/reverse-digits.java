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
            long n = Long.parseLong(br.readLine().trim());            
            Solution ob = new Solution();
            long ans = ob.reverse_digit(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    long ans=0;
    public long reverse_digit(long n)
    {
        
        if(n==0){
            return ans;
        }
        
            
            long rem=n%10;
            
            ans=ans*10 + rem;
            
            reverse_digit(n/10);
            

    return ans;    
    }
}