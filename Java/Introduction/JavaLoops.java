import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
            {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int sum = a;
            for(int count=0;count<n;count++)
                { 
                    int power= (int)Math.pow(2,count);
                    sum += (power*b);
                    System.out.print(sum+" ");
                }
           System.out.println();
            
        }
        
        sc.close();
            
    }
}