import java.io.*;
import java.util.*;

public class Solution {

   static boolean isAnagram(String A, String B) {
      //Complete the function
       A = A.toLowerCase();
       int ALength = A.length();
       B = B.toLowerCase();
       List<String> AList = new ArrayList<String>(Arrays.asList(A.split("")));
       List<String> BList = new ArrayList<String>(Arrays.asList(B.split("")));
       for(String alpha : BList)
           AList.remove(alpha);
       
       if(AList.size()==0 && ALength == B.length())
           return true;
       else
           return false;
   
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
