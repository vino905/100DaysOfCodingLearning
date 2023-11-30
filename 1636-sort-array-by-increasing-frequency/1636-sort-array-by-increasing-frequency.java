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
        if (c1.freq == c2.freq) {
            return c2.val - c1.val; // If frequencies are the same, sort by value in descending order
        }
        return c1.freq - c2.freq; // Sort by increasing frequency
    }
}

class Solution {
    public int[] frequencySort(int[] nums) {
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
            
        }
    int ans[]=new int[nums.length];
    int j=0;    
    while(pq.size()>0){
        
        int k=pq.peek().freq;
        int v=pq.peek().val;
        
        for(int i=0;i<k;i++){
            ans[j]=v;
            j++;
        }
        pq.poll();
    }
    
    return ans;    
    }
}