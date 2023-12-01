class Combi{
    
    int dist;
    int xCor;
    int yCor;
    
    Combi(int d,int x,int y){
        this.dist=d;
        this.xCor=x;
        this.yCor=y;
    }
}

class Comp implements Comparator<Combi>{
    public int compare(Combi d1 , Combi d2){
        return d2.dist - d1.dist;
    }
}

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Combi> pq=new PriorityQueue<>(new Comp());
        
        for(int i=0;i<points.length;i++){
            int x=points[i][0];
            int y=points[i][1];
            
            int d=x*x + y*y;
            pq.add(new Combi(d,x,y));
            
            if(pq.size()>k){
                pq.remove();
            }
        }
        
        int[][] ans= new int[k][2];
        int cnt=0;
        while(pq.size()>0){
            Combi c=pq.remove();
            int x=c.xCor;
            int y=c.yCor;
            ans[cnt][0]=x;
            ans[cnt][1]=y;
            cnt++;
        }
    return ans;    
    }
}