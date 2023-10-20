//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            String ans = obj.postToInfix(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static boolean isOperand(char x)
      {
    return (x >= 'a' && x <= 'z') ||
            (x >= 'A' && x <= 'Z');
        }
        
    static String postToInfix(String x) {
        
        Stack<String> st=new Stack<>();
        
        for(int i=0;i<x.length();i++){
         
            if(isOperand(x.charAt(i))){
                st.push(x.charAt(i)+"");
            }
            else{
                String firstVal= st.peek();
                st.pop();
                String secondVal=st.peek();
                st.pop();
                st.push("("+secondVal+x.charAt(i)+firstVal+")");
            }
            
        }
    return st.peek();    
    }
}
