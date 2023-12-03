class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq = new PriorityQueue<>((a, b) -> b - a);
       
        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
            
        } 
        while(pq.size()>1){
            int num ;
            if((num = pq.poll()- pq.poll())!=0)  {
                pq.add(num);
            } 
        }        
        if(pq.size()==0 )  return 0;
        
        return pq.poll();
    }
}