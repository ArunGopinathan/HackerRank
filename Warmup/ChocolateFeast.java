/**
 * 
 */
package hackerRank;

import java.util.Scanner;

/**
 * @author Arun.G
 * 
 */
public class ChocolateFeast {

	/**
	 * @param args
	 */
	//Number of chocolates we actually can buy using available money
	private static int numberOfChocolates(int N, int C) {
		return N / C;
	}

	//calculate how much chocolate we can buy with the wrappers
	private static int numberOfChocolatesForWrappers(int chocolates, int M) {
		int result = 0;
		while (chocolates / M > 0) {
			result += chocolates / M; //chocolate we can get
			//chocolates we can get + chocolate/ wrappers unused 
			chocolates = (chocolates / M) + (chocolates % M);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int C = sc.nextInt();
			int M = sc.nextInt();

			int totChocolates = 0;
			totChocolates = numberOfChocolates(N, C)
					+ numberOfChocolatesForWrappers(numberOfChocolates(N, C), M);
			System.out.println(totChocolates);
		}
		sc.close(); // close the scanner
	}

}
