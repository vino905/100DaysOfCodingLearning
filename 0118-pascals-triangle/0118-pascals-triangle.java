class Solution {
    public List<Integer> pascalRow(int row){
        List<Integer> res=new ArrayList<>();
        long ans=1;
        res.add(1);
        for(int i=1;i<row;i++){
            ans=ans*(row-i);
            ans=ans/i;
            res.add((int)ans);
        }
    return res;    
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
           ans.add(pascalRow(i));
        }
    return ans;    
    }
}