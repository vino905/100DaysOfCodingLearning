//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            String str[] = br.readLine().split(" ");
            int arr[] = new int[str.length];

            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            Solution obj = new Solution();

            obj.reverseArray(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    public void reverseArray(int arr[]) {
        int n = arr.length;
        int p1=0;
        int p2= n-1;
        while(p2>p1){
            int temp = arr[p1];
            arr[p1]=arr[p2];
            arr[p2]= temp;
            p1++;
            p2--;
        }
    }
}