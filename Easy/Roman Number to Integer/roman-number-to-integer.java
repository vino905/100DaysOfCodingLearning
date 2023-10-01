//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
     public int getInt(char c){
        switch(c){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' :  return 500;
            case 'M' :  return 1000;
            default : return -1;

        }
    }
    public int romanToDecimal(String s) {
        
        int i=0, res=0, curr ,next ,n=s.length();

        while(i<n){
            if(i==n-1){
                 res+=getInt(s.charAt(i));
                 return res;
            }
            curr=getInt(s.charAt(i));
            next=getInt(s.charAt(i+1));

            if(curr>=next){
                res+=curr;
                i++;
            }
            else{
                res+=next-curr;
                i=i+2;
            }
            
        }
    return res;  
    }
}