//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        String s= Integer.toString(n);
        int l= s.length();
        int temp=n;
        int res=0;
        
    while(temp>0){
        int rem=temp%10;
        res = res+(int)Math.pow(rem,l);
        temp =temp/10;
    }
    return n==res?"Yes":"No";
    }
}