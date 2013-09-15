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
public class ValidPANformat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int numberOfPans = sc.nextInt();
       
        while(numberOfPans-- >=0)
        {
            String pan = sc.nextLine();
            if(!pan.equals(""))
            {
               Pattern panPattern = Pattern.compile("\\b[A-Z]{5}\\d{4}[A-Z]{1}");
                Matcher m = panPattern.matcher(pan);
                if(m.find())
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
           
        }
        sc.close();
	}

}
