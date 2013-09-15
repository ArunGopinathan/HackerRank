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

public class UtopianIdentificationNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        while(no-->=0)
        {
            String word = sc.nextLine();
            int count=0;String result="";
            if(!word.equals(""))
            {
                //for country
                String patternString ="\\b[a-z]{0,3}[0-9]{2,8}[A-Z]{3}";
                Pattern pattern = Pattern.compile(patternString);
                Matcher m = pattern.matcher(word);
                if(m.find())
                {
                    System.out.println("VALID");
                }
                else
                {
                     System.out.println("INVALID");
                } 
            }
        }
        sc.close();
	}

}
