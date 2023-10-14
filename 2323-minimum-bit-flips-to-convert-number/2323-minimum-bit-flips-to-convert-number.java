class Solution {
    public int minBitFlips(int start, int goal) {
        int cnt=0;
        int flipped=start^goal;
        while(flipped!=0){
            int rsb=(flipped&(-flipped));
            flipped-=rsb;
            cnt++;
        }
    return cnt;    
    }
}