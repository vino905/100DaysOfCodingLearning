class Solution {
    public String minWindow(String s, String t) {
        int i=0,j=0;
        int sLen=s.length();
        int tLen=t.length();
        int maxLen=Integer.MAX_VALUE;
        int start=0,end=0;

        HashMap<Character,Integer> map=new HashMap<>();
        for(int k=0;k<tLen;k++){
            char ch=t.charAt(k);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        int cnt=map.size();
       while(j<sLen){
           char c=s.charAt(j);
           if(map.containsKey(c)){
               map.put(c,map.get(c)-1);
               if(map.get(c)==0){
                   cnt--;
               }
           }
           if(cnt==0){
               while(cnt==0){
                   if(maxLen>j-i+1){
                       maxLen=j-i+1;
                       start=i;
                       end=j+1;
                   }
                   char cRem=s.charAt(i);
                   if(map.containsKey(cRem)){
                       map.put(cRem,map.get(cRem)+1);
                       if(map.get(cRem)>0){
                         cnt++;
                       }
                   }
                i++;   
               }
           }
        j++;   
       }
    return s.substring(start,end); 
    }
}