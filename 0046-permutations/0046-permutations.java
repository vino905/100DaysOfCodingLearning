class Solution {
    public void recPermute(int[] nums, boolean[] freq,List<Integer> temp, List<List<Integer>> ans){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                temp.add(nums[i]);
                recPermute(nums,freq,temp,ans);
                temp.remove(temp.size()-1);
                freq[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
        recPermute(nums,freq,temp,ans);
        return ans;       
    }
}