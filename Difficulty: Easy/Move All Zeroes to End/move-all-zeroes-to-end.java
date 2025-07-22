// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int j = -1;
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        
        if(j==-1){
            return;
        }
        
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
}