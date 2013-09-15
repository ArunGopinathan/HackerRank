/**
 * 
 */
package hackerRank;

/**
 * @author Arun.G
 *
 */
import java.util.Scanner;
public class FindHackerrank {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        String conversation="";
	        int numberOfLines=sc.nextInt();
	        conversation=sc.nextLine();
	        while((sc.hasNextLine()))
	        {
	            conversation=sc.nextLine();
	            // System.out.println(conversation);
	            if(conversation.startsWith("hackerrank") &&  conversation.endsWith("hackerrank"))
	                System.out.println("0");
	            else if(conversation.startsWith("hackerrank"))
	                System.out.println("1");
	            else if(conversation.endsWith("hackerrank"))
	                System.out.println("2");
	            else
	                System.out.println("-1");
	        }
	        sc.close();
	}

}
