//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String s;
            s = br.readLine();

            Solution obj = new Solution();
            String res = obj.removeOuter(s);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String removeOuter(String s) {
        StringBuilder res= new StringBuilder();
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' && cnt++ >0 ){
                res.append(s.charAt(i));
            }
            if(s.charAt(i) == ')' && cnt-- >1 ){
                res.append(s.charAt(i));
            }
        }
    return res.toString();    
    }
}
