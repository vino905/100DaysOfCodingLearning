class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        if(k==n)        
        return "0";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<n;i++){
            while(k>0 && !stack.isEmpty() && stack.peek()>num.charAt(i)){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
    
        }
        
        while(k>0){
            stack.pop();
            k--;            
        }
        
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty())
            ans.append(stack.pop());
        ans.reverse();
        
        while(ans.length()>1 && ans.charAt(0)=='0')
            ans.deleteCharAt(0);
        return ans.toString();
    }
}