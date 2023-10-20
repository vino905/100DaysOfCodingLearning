//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(
                new Solution().infixToPostfix(br.readLine().trim()));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to convert an infix expression to a postfix expression.
    
    private static int precedence(char operator) {
        if (operator == '^') {
            return 3;
        } else if (operator == '*' || operator == '/') {
            return 2;
        } else if (operator == '+' || operator == '-') {
            return 1;
        } else {
            return -1; 
        }
        
    }
    public static String infixToPostfix(String exp) {
        // Your code here
        Stack<Character> st=new Stack<>();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.pop());
                }
                st.pop(); 
            } else {
                while (!st.isEmpty() && precedence(ch) <= precedence(st.peek())) {
                    ans.append(st.pop());
                }
                st.push(ch);
            }
        }
        while (!st.isEmpty()) {
            if (st.peek() == '(') {
                return "Invalid expression";
            }
            ans.append(st.pop());
        }

        return ans.toString();
        
    }
}