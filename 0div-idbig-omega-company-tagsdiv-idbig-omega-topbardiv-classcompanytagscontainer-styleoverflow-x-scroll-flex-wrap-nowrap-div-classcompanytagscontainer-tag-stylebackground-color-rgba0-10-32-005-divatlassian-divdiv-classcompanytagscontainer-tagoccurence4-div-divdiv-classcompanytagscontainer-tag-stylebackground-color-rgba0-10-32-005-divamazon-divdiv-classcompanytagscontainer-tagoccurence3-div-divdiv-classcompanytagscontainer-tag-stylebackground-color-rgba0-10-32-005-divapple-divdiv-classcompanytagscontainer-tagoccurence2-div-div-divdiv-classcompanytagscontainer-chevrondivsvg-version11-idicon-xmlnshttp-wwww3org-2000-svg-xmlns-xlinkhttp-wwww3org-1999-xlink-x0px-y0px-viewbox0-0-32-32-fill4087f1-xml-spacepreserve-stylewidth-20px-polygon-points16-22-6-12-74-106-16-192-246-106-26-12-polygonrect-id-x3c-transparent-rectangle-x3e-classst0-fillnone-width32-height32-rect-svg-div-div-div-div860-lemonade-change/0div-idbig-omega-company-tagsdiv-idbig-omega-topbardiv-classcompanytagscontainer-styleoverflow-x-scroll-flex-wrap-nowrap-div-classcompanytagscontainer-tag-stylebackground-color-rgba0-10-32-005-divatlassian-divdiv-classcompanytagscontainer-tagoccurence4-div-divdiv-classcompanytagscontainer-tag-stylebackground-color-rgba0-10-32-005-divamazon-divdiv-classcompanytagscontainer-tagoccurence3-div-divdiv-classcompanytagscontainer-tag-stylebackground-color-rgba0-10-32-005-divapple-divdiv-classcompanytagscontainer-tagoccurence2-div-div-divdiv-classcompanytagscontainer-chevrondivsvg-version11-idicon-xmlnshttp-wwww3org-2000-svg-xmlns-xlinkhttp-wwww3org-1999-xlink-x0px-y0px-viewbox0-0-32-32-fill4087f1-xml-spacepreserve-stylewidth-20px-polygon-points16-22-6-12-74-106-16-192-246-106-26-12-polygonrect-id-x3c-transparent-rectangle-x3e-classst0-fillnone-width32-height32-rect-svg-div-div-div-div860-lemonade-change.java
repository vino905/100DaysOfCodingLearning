class Solution {
    public boolean lemonadeChange(int[] bills) {
    
    int five=0,ten=0 ,cnt=0;
        
    for(int i : bills){
        if(i==5){
            five++;
            cnt++;
        }
        else if(i==10 && five>0){
            five--;
            ten++;
            cnt++;
        }
        else if(i==20){
       if( five>0 && ten>0){
            five--;
            ten--;
            cnt++;
        }
        else if( five>=3){
            five-=3;
            cnt++;
        }
       else {
           return false;
       }
    }      
    }
    return cnt==bills.length;    
    }
}