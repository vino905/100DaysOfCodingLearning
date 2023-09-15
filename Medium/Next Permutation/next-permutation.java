//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    
    static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
    
    static List<Integer> arrayToList(int[] arr){
        
        List<Integer> res = new ArrayList<>();
        for(int i:arr){
            res.add(i);
        }
        return  res;
    }
    static List<Integer> nextPermutation(int N, int arr[]){
        int ind=-1;
        for(int i=N-2;i>=0;i--){
            if(arr[i] < arr[i+1]){
                ind=i;
                break;
            }
        }
       if(ind==-1){
           reverse(arr,0,N-1);
           return arrayToList(arr);
       }    
       for(int i=N-1;i>ind;i--){
           if(arr[i] > arr[ind]){
               int temp=arr[i];
               arr[i]=arr[ind];
               arr[ind]=temp;
               break;
           }
       }  
    reverse(arr,ind+1,N-1);
    return arrayToList(arr);
    }
}