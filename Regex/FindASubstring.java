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

public class FindASubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		String line = "";
		while (no-- >= 0)
			line += " " + sc.nextLine();
		int testCases = sc.nextInt();
		while (testCases-- >= 0) {
			String word = sc.nextLine();
			int count = 0;
			if (!word.equals("")) {
				String pattern = "[a-z_]{1,}" + word + "[a-z_]{1,}";
				Pattern wordPattern = Pattern.compile(pattern);
				Matcher m = wordPattern.matcher(line);
				while (m.find())
					count++;

				System.out.println(count);
			}
		}
		sc.close();
	}

}
