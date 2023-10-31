class Solution {
    public int characterReplacement(String s, int k) {
        
    int i=0;
    int j=0;
    int cnt=0;
    int ans=0;
    HashMap<Character,Integer> map=new HashMap<>();
    while(j<s.length()) {
        char c = s.charAt(j);
        map.put(c,map.getOrDefault(c,0)+1);
        
        cnt=Math.max(cnt,map.get(c));
        if (j - i + 1 - cnt > k) {
            map.put(s.charAt(i),map.get(s.charAt(i))-1);
            i++;
        }

        ans = Math.max(ans, j-i + 1);
        j++;
    }

    return ans;
    }
}