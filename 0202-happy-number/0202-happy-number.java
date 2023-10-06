class Solution {
    public int squre(int n){
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans+=rem*rem;
            n=n/10;
        }
    return ans;

    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do{
            slow=squre(slow);
            fast=squre(squre(fast));
        }
        while(slow!=fast);

        if(slow==1){
            return true;
        }
    return false;    
    }
}