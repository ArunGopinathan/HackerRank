import java.io.*;
import java.util.*;

public class Solution {

    public static String capitalizeWord(String word)
        {
        if(word.length()>1)
            {
            return ( Character.toUpperCase(word.charAt(0))+  word.substring(1) );
            }
        else if (word.length() == 1)
            {
             return (Character.toUpperCase(word.charAt(0))+"");
        }
      return "";  
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        System.out.println((A.compareTo(B)>0)?"Yes":"No");
        System.out.println(capitalizeWord(A)+" "+ capitalizeWord(B));
        /* Enter your code here. Print output to STDOUT. */
        
    }
}
