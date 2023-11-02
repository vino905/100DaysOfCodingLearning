class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int i=0,j=n-k;
        int sum=0;

        for(int t=j;t<n;t++){
            sum+=cardPoints[t];
        }
        int ans=sum;

        while(j<n){
            sum+=(cardPoints[i]-cardPoints[j]);
            ans=Math.max(ans,sum);
            i++;
            j++;
        }
    return ans;
    }
}