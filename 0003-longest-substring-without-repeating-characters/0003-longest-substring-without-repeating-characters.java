class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int n=s.length();
        int max=0;
        if (s==null || n== 0 ) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        while(j<n){
            char ch=s.charAt(j);

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }

            if(map.size()==(j-i+1)){
                max=Math.max((j-i+1),max);
                j++;
            }

            else if(map.size()<(j-i+1)){
                while(map.size()<(j-i+1)){
                    char c= s.charAt(i);
                    map.put(c,map.get(c)-1);       
                    if(map.get(c)==0){
                        map.remove(c);
                    }
                i++;    
                }
            j++;    
            }
        }
    return max;    
    }
}