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

public class SplitthePhoneNumbers {

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
			String result = "";
			if (!word.equals("")) {
				// for country
				String pattern = "([0-9]{1,})[ -]{1}([0-9]{1,3})[ -]{1}([0-9]{4,10})";
				Pattern phonePattern = Pattern.compile(pattern);
				Matcher m = phonePattern.matcher(word);
				if (m.matches()) {
					String countryCode = m.group(1);
					String localAreaCode = m.group(2);
					String Number = m.group(3);

					result = "CountryCode=" + countryCode + ",LocalAreaCode="
							+ localAreaCode + ",Number=" + Number;
				}
				System.out.println(result);
			}
		}
		sc.close();
	}

}
