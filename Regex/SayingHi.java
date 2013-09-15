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
public class SayingHi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        while(sc.hasNextLine())
        {
            String line = sc.nextLine();
            Pattern hiPattern = Pattern.compile("^(h|H){1}(I|i){1} [^d]");
            Matcher m = hiPattern.matcher(line);
            
            if(m.find())
                System.out.println(line);
        }
        sc.close();
	}

}
