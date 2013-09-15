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

public class AlienUsername {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		while (no-- >= 0) {
			String word = sc.nextLine();
			int count = 0;
			if (!word.equals("")) {
				// for country
				String pattern = "^[._]{1}[0-9]{1,}[a-zA-Z]{0,}_{0,1}$";
				Pattern userNamePattern = Pattern.compile(pattern);
				Matcher m = userNamePattern.matcher(word);
				if (m.find()) {
					System.out.println("VALID");
				} else {
					System.out.println("INVALID");
				}
			}
		}
		sc.close();
	}

}
