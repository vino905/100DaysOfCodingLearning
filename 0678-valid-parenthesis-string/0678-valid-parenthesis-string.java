class Solution {
    public boolean checkValidString(String s) {
        int leftMin=0, leftMax=0;
        
        for(int i=0;i<s.length();i++){
            char currChar=s.charAt(i);
            if(currChar=='('){
                leftMin++;
                leftMax++;
            }
            else if(currChar==')'){
                leftMin--;
                leftMax--;
            }
            else{
                leftMin--;
                leftMax++;
            }
            
            if(leftMax<0){
                return false;
            }
            
            if(leftMin<0){
                leftMin=0;
            }
        }
    return leftMin==0;    
    }
}