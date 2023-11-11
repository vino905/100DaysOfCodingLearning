//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static boolean isSafe(int newX ,int newY,int [][] visited,int[][] m,int n){
        if((newX>=0 && newX<n) && (newY>=0 && newY<n) && visited[newX][newY]!=1 && m[newX][newY]==1){
            return true;
        } 
        else{
            return false;
        }
    }
    public static void solve(int x,int y, ArrayList<String> ans ,int[][] m, String path,int [][] visited,int n){
        
        if(x==n-1 && y==n-1){
            ans.add(path);
            return;
        }
        
        visited[x][y]=1;
        // Down 
        if(isSafe(x+1,y, visited , m , n)){
            solve(x+1,y,ans,m,path+"D",visited,n);
        }
        // Left
        if(isSafe(x,y-1, visited , m , n)){
            solve(x,y-1 ,ans,m,path+"L",visited,n);
        }
        // Right
        if(isSafe(x,y+1, visited , m , n)){
            solve(x,y+1,ans,m,path+"R",visited,n);
        }
        // Up
        if(isSafe(x-1,y, visited , m , n)){
            solve(x-1,y,ans,m,path+"U",visited,n);
        }
        visited[x][y]=0;
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> ans=new ArrayList<>();
        
        if(n==0 || m[0][0]==0){
            return ans;
        }
        
        int [][] visited = new int[n][n];
        
        String path="";
        solve(0,0,ans,m,path,visited,n);
        return ans;
        
    }
}