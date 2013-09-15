/**
 * 
 */
package hackerRank;

/**
 * @author Arun.G
 *
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
public class Pairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int n=0,k=0,count=0;
	        n= sc.nextInt();
	        k=sc.nextInt();
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        //adding all the numbers to list
	        while(sc.hasNextInt())
	            list.add(sc.nextInt());
	       
	        int numa=0,numb=0;
	        //sorting the list
	        Collections.sort(list);
	        for(int i=0;i<list.size();i++)
	        {
	            numa = (int)list.get(i);
	            for(int j=i+1;j<list.size();j++)
	            {
	              numb = (int)list.get(j);
	              if(numa<numb)
	              {
	                if(Math.abs(numa-numb)==k)
	                    count++;
	                if(Math.abs(numa-numb)>k)
	                    break;
	              }
	              else
	              {
	                j=i;
	              }
	            }
	                   
	        }
	        System.out.println(count);
	        sc.close();
	}

}
