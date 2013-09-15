/**
 * 
 */
package hackerRank;

import java.util.Scanner;

/**
 * @author Arun.G
 * 
 */
public class FindAWord {

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
		// split all the words using the regex it considers only words with _ as
		// single word
		String[] AllWords = line.split("\\W");
		int testCases = sc.nextInt();
		while (testCases-- >= 0) {
			String word = sc.nextLine();
			int count = 0;
			if (!word.equals("")) {
				String pattern = word;
				// See if we have a match and increase count
				for (int i = 0; i < AllWords.length; i++) {
					if (AllWords[i].matches(pattern))
						count++;
				}

				System.out.println(count);
			}
		}
		sc.close();
	}

}
