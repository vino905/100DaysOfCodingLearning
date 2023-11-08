//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    void subSet(int ind, int sum,ArrayList<Integer> arr, int N, ArrayList<Integer> subSets){
        if(ind==N){
            subSets.add(sum);
            return;
        }
        
        subSet(ind+1,sum+arr.get(ind),arr,N,subSets);
        subSet(ind+1,sum,arr,N,subSets);
    }
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> subSets=new ArrayList<>();
        subSet(0,0,arr,N,subSets);
        Collections.sort(subSets);
        return subSets;
    }
}