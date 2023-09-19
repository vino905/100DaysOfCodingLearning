//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n1) {
        long n= n1;
        long sumOfFirstN =(n*(n+1))/2;
        long sumOfFirstN2 =(n*(n+1)*(2*n+1))/6;
        
        //for storing the sum of array elements
        long s1=0;
        //for storing the square sum of array elements
        long s2=0;
        for(int i=0;i<n;i++){
            s1+=(long)arr[i];
            s2+=(long)arr[i]*(long)arr[i];
        }
        long val1= sumOfFirstN -s1;
        long val2= sumOfFirstN2 -s2;
        
        val2=val2/val1;
        
        long x = (val1+val2)/2;
        long y = x-val1;
        int[] ans = {(int)y,(int)x};
        return ans;
    }
}