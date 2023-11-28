
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res= new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<>() {
            @Override
            public int compare(Integer a, Integer b) {
                if(Math.abs(a-x) == Math.abs(b-x)) {
                    return Integer.compare(a, b);
                } else {
                    return Integer.compare(Math.abs(a-x), Math.abs(b-x));
                }
            }
        });
        
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        
        }
       for(int i=0;i<k;i++) {
            res.add(pq.poll());
        }
    Collections.sort(res);    
    return res;    
    }
}