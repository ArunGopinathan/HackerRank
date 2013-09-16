/**
 * 
 */
package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Arun.G
 * 
 */
public class DetectHTMLTags {

	/**
	 * @param args
	 */
	public static void printList(ArrayList<String> list) {
		String result = "";
		for (String tag : list)
			result += ";" + tag;

		if (result.startsWith(";"))
			result = result.substring(1);

		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		while (no-- >= 0) {

			String word = sc.nextLine();
			String result = "";
			if (!word.equals("")) {
				String tagPattern = "<([^\">]+(?:\"[^\"]+\")*[^>]+)>";
				Pattern pattern = Pattern.compile(tagPattern);
				Matcher m = pattern.matcher(word);
				while (m.find()) {
					result = m.group(1);
					System.out.println(result);
					//split space to get tag
					String[] group = result.split(" ");
					result = group[0];
					result = result.replace("/", "");// remove / since it matches /a etc
					//add only if not in list
					if (!list.contains(result))
						list.add(result);
				}
				// sort the list
				Collections.sort(list);
			}

		}
		// print result
		printList(list);
		// close scanner
		sc.close();
	}

}
