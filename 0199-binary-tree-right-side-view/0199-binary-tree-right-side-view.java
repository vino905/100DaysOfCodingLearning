/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> ans=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        
        rightSide(root,0);
        return ans;
    }
    
   public void  rightSide(TreeNode root,int level){
       if(root==null){
           return;
       }
       if(ans.size()==level){
           ans.add(root.val);
       }
       rightSide(root.right,level+1);
       rightSide(root.left,level+1);
   }
}