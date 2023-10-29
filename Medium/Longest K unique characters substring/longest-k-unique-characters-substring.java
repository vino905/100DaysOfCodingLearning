//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
          int i = 0;
    int j = 0;
    int n = s.length();
    int max = -1;
    
    if (s==null || s.length() == 0 || k <= 0) {
            return -1;
    }

    HashMap<Character, Integer> map = new HashMap<>();

    while (j < n) {
        char ch = s.charAt(j);
        if (map.containsKey(ch)) {
            map.put(ch, map.get(ch) + 1);
        } else {
            map.put(ch, 1);
        }

        if (map.size() < k) {
            j++;
        } 
        
        else if (map.size() == k) {
            max = Math.max(max, j - i + 1);
            j++;
        } 
        
        else if (map.size() > k) {
            while (map.size() > k) {
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                if (map.get(s.charAt(i)) == 0) {
                    map.remove(s.charAt(i));
                }
                i++;
            }
            j++;
        }
    }
    return max;
    }
}