class Solution {
    public int numberOfSubstrings(String s) {
        int i=0,j=0,cnt=0;
        int n=s.length();
        if(3>n){
            return 0;
        }
        HashMap<Character , Integer> map=new HashMap<>();

        while(j<n){
            char ch=s.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }

            while(map.size()==3){
                char c=s.charAt(i);
                if(map.containsKey(c)){
                    map.put(c,map.get(c)-1);
                    if(map.get(c)==0){
                        map.remove(c);
                    }
                }
               i++; 
            }
        cnt+=i;    
        j++;    
        }
    return cnt;    
    }
}