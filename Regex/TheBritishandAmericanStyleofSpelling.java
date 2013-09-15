/**
 * 
 */
package hackerRank;

import java.util.regex.*;
import java.util.Scanner;
/**
 * @author Arun.G
 *
 */
public class TheBritishandAmericanStyleofSpelling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        int numberOfLines = sc.nextInt();
        String line ="";
        int count=0;
        //getting all the lines in String
        while(numberOfLines-- >=0)
        {
          line+=(" "+sc.nextLine()); 
        }
        int numberOfTestCases=sc.nextInt();
       
       //processing test cases one by one
        while(numberOfTestCases-- >=0)
        {
          
            String americanword =sc.nextLine();
            count=0;
            Pattern ra = Pattern.compile(americanword);
            String pattern = americanword.replace("z","s");
       
            if(!pattern.equals(""))
            {
            Pattern rb = Pattern.compile(pattern);
            // Now create matcher object.
            Matcher ma = ra.matcher(line);
            Matcher mb = rb.matcher(line);
             
              while(ma.find())
              {
                 count++;
              }
              while(mb.find())
              {
                 count++;
              }
                System.out.println(count);
            }
           
        }
	}

}
