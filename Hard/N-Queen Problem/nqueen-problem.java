//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.nQueen(n);
            if(ans.size() == 0)
                System.out.println("-1");
            else {
                for(int i = 0;i < ans.size();i++){
                    System.out.print("[");
                    for(int j = 0;j < ans.get(i).size();j++)
                        System.out.print(ans.get(i).get(j) + " ");
                    System.out.print("] ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int[][] board;
    static ArrayList<ArrayList<Integer>> ans;
    static HashMap<Integer,Boolean> rowCheck;
    static HashMap<Integer,Boolean> leftUp;
    static HashMap<Integer,Boolean> leftDown;
    
    static void solve(int col, int n){
        if(col==n){
            addRes(n);
            return;
        }
        
        for(int row=0; row<n; row++){

            if(isSafe(row,col,n)){
                board[row][col] = 1;
                

                rowCheck.put(row,true);
                leftUp.put(row+col,true);
                leftDown.put(n-1+col-row,true);
                
                solve(col+1,n);
                board[row][col] = 0;
                
                rowCheck.remove(row);
                leftUp.remove(row+col);
                leftDown.remove(n-1+col-row);
            }
        }
    }
    
    static void addRes(int n){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<n; j++){
                if(board[i][j]==1){
                    res.add(j+1);
                    break;
                }
            }
        }
        ans.add(res);
    }
 
 
    static boolean isSafe(int row, int col, int n){
        if(rowCheck.getOrDefault(row,false))
            return false;
        if(leftUp.getOrDefault(row+col,false))
            return false;
        if(leftDown.getOrDefault(n-1+col-row,false))
            return false;
        return true;
    }
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        board = new int[n][n];
        ans = new ArrayList<ArrayList<Integer>>();
        rowCheck = new HashMap<Integer,Boolean>();
        leftUp = new HashMap<Integer,Boolean>();
        leftDown = new HashMap<Integer,Boolean>();
        solve(0,n);
        
        // Sort on the basis of inner list
        Collections.sort(ans, (list1, list2)->{
            int len = list1.size();
            
            for(int i=0; i<len; i++){
                int comparisonResult = Integer.compare(list1.get(i),list2.get(i));
                if(comparisonResult!=0){
                    return comparisonResult;
                }
            }
            return 0;
        });
        
        return ans;
    }
}