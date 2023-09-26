//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages
    public static int minimumPages(int []A,int N,int expPages){
        int reqStudents=1 , reqPages=0;
        for(int i=0;i<N;i++){
            if(reqPages+A[i]<=expPages){
                reqPages+=A[i];
            }
            else{
                reqStudents++;
                reqPages=A[i];
            }
        }
    return  reqStudents;   
    }
    public static int findPages(int[]A,int N,int M)
    {
        if(M>N){
            return -1;
        }
        int max=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i <N; i++) {
            max = Math.max(max, A[i]);
            sum+=A[i];
        }
        
        while(max<=sum){
          int mid= max+(sum-max)/2;
            int minPages=minimumPages(A,N,mid);
            if(minPages<=M){
                sum=mid-1;
            }
            else{
                max=mid+1;
            }
        }
    return max;    
    }
};