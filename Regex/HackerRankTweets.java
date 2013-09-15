/**
 * 
 */
package hackerRank;

/**
 * @author Arun.G
 *
 */
import java.util.Scanner;
import java.util.regex.*;
public class HackerRankTweets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     int number = sc.nextInt(); 
	     int count=0;
	     while(sc.hasNextLine())
	     {
	           String line = sc.nextLine();
	           Pattern hiPattern = Pattern.compile("hackerrank",Pattern.CASE_INSENSITIVE);
	           Matcher m = hiPattern.matcher(line);
	           while(m.find())
	           {
	               count++;
	           }              
	     }
	       System.out.println(count);
	       sc.close();
	}

}
