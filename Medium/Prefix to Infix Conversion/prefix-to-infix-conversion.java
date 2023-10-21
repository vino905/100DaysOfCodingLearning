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
            String ans = obj.preToInfix(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    
    private static boolean isChar(char ch){
        if((ch>='A' && ch<='Z') ||(ch>='a' && ch<='z')){
            return true;
        }
    return false;    
    }
    static String preToInfix(String pre_exp) {
        // code here
        
        Stack<String> st=new Stack<>();
        
        for(int i=pre_exp.length()-1;i>=0;i--){
            
            if(isChar(pre_exp.charAt(i))){
                st.push(pre_exp.charAt(i)+"");
            }
            else{
                String op1=st.peek();
                st.pop();
                
                String op2=st.peek();
                st.pop();
                
                String res= "("+op1+pre_exp.charAt(i)+op2+")";
                
                st.push(res);
            }
        }
    return st.peek();    
    }
}
