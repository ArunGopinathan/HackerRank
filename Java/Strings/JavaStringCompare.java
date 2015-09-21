import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int k = sc.nextInt();
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i+k<=text.length();i++)
            {
            String word = text.substring(i,i+k);
          //  System.out.println(word);
            if(!list.contains(word))
                list.add(word);
            
        }
        Collections.sort(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
        sc.close();
    }
}