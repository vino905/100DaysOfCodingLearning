class Combi{
    int freq;
    int val;
    
    Combi(int freq,int val){
        this.freq=freq;
        this.val=val;
    }
}

class Comp implements Comparator<Combi>{
    public int compare(Combi c1, Combi c2){
        return c1.freq-c2.freq;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        
        PriorityQueue<Combi> pq=new PriorityQueue<>(new Comp());
        
        for(int i:map.keySet()){
            pq.add(new Combi(map.get(i),i));
            
            if(pq.size()>k){
                while(pq.size()!=k){
                    pq.remove();
                }
            }
        }
    int ans[]=new int[k];
        
    for(int i=0;i<k;i++){
        ans[i]=pq.remove().val;
    }
    
    return ans;    
    }
}