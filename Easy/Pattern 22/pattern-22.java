//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printSquare(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printSquare(int n) {
        // code here
        
        for(int i=0;i<((2*n)-1);i++)
        {
            for(int j=0;j<((2*n)-1);j++){
                
               int top = i;
                int bottom =j;
                int right = (2*n-2)-j;
                int left = (2*n-2)-i;
                
                int res=n - (Math.min(Math.min(top,bottom),Math.min(left,right)));
                System.out.print(res +" ");
            }
        System.out.println();    
        }
    }
}