class Solution {
    public int maxDepth(String s) {
        int curCnt=0 , maxDepth=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                curCnt++;
                maxDepth=Math.max(curCnt,maxDepth);
            }
            else if(ch==')'){
                curCnt--;
            }
        }
    return maxDepth;    
    }
}