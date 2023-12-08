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

class Tuple{
    TreeNode node;
    int vert;
    int level;
    
    Tuple(TreeNode node, int vert,int level){
        this.node=node;
        this.vert=vert;
        this.level=level;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>>  map=new TreeMap<>();
        Queue<Tuple> q=new LinkedList<Tuple>();
        q.offer(new Tuple(root,0,0));
        
        while(!q.isEmpty()){
            Tuple t=q.poll();
            TreeNode node= t.node;
            int x=t.vert;
            int y=t.level;
            
            if(!map.containsKey(x)){
                map.put(x,new TreeMap<>());
            }
            if(!map.get(x).containsKey(y)){
                map.get(x).put(y,new PriorityQueue<>());
            }
            map.get(x).get(y).offer(node.val);
            
            if(node.left!=null){
                q.offer(new Tuple(node.left,x-1,y+1));
            }
            if(node.right!=null){
                q.offer(new Tuple(node.right,x+1,y+1));
            }
        }
        
        List<List<Integer>> ls=new ArrayList<>();
        
        for(TreeMap<Integer,PriorityQueue<Integer>> y:map.values()){
            ls.add(new ArrayList<>());
            
            for(PriorityQueue<Integer> nodes:y.values()){
                while(!nodes.isEmpty()){
                    ls.get(ls.size()-1).add(nodes.poll());
                }
            }
        }
        
        
        return ls;
    }
    
    
    
    
}