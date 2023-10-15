class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{')
                st.push(ch);
            else {
                if(st.isEmpty()) return false;
                char top = st.pop(); 
                if((ch == ')' && top == '(') ||  (ch == ']' && top == '[') || (ch == '}' && top == '{')) continue;
                else return false;
            }
        }
        return st.isEmpty();
    }
}