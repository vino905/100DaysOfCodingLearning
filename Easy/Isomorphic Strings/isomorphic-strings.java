//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;


public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Solution obj = new Solution();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}

// } Driver Code Ends


class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
       int s1=str1.length();
       int s2=str2.length();
       if(s1!=s2){
           return false;
       }
       //for mapping string1 character to String2 character
       HashMap<Character,Character> map1 = new HashMap<>();
       //for maintaing charcter those are mapped
       HashMap<Character,Boolean>  map2= new HashMap<>();
       for(int i=0;i<s1;i++){
           char ch1=str1.charAt(i);
           char ch2=str2.charAt(i);
           if(map1.containsKey(ch1)){
               if(map1.get(ch1)!=ch2){
                   return false;
               }
           }
           else{
               if(map2.containsKey(ch2)==true){
                   return false;
               }
               else{
                   map1.put(ch1,ch2);
                   map2.put(ch2,true);
               }
           }
       }
       
    return true;    
    }
}