class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<asteroids.length;i++){
            if(st.isEmpty() || asteroids[i]>0){
                st.push(asteroids[i]);
            }

            else{

                while(!st.isEmpty()){
                    int top=st.peek();

                    if(top<0){
                        st.push(asteroids[i]);
                        break;
                    }
                    int absVal=Math.abs(asteroids[i]);

                    if(absVal==top){
                        st.pop();
                        break;
                    }
                    else if(absVal<top){
                        break;
                    }
                    else{
                        st.pop();
                        if(st.isEmpty()){
                            st.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }

        }
        int n=st.size();
        int[] ans=new int[n]; 
        for(int i=n-1;i>=0;i--){
            ans[i]=st.pop();
        }
    return ans;    
    }
}