class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();

        HashMap<Character,Integer> map=new HashMap<>();
        int p_len=p.length();
        int j=0;
        int k=0;
        int s_len=s.length();
        for(int i=0;i<p_len;i++){
            char ch=p.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        int count=map.size();
        while(j<s_len){
            
        char ch=s.charAt(j);

        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)-1);

            if(map.get(ch)==0){
                count--;
            }
        }
        
        if(j-k+1 < p_len){
                j++;
            }
        else if(j-k+1==p_len){

            if(count==0){
                ans.add(k);
            }
                char c=s.charAt(k);
                if(map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                    if(map.get(c)==1){
                        count++;
                    }
                }
                k++;
                j++;
            
        }

        }
    return ans;    
    }
}