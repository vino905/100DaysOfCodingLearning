//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n;
            n = sc.nextInt();

            int k;
            k = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.solve(n, k, v);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static boolean cowCanPlace(int [] stalls,int t,int k,int n){
        
        int last=stalls[0] , cowCnt=1;
        
        for(int i=1;i<n;i++){
            if(stalls[i]-last>=t){
                cowCnt++;
                last=stalls[i];
            }
            if(cowCnt>=k) return true;
            
        }
    return false;    
    }
    public static int solve(int n, int k, int[] stalls) {
        
        Arrays.sort(stalls);
        int low=1;
        int high=stalls[n-1]-stalls[0];
        
        while(low<=high){
            int mid= low + (high-low)/2;
            if(cowCanPlace(stalls,mid,k,n)==true){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
    return high;    
    }
}