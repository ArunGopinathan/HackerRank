/**
 * 
 */
package hackerRank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author Arun.G
 * 
 */
public class Flowers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// helpers for input/output
		Scanner in = new Scanner(System.in);

		int N, K;
		N = in.nextInt();
		K = in.nextInt();

		Integer C[] = new Integer[N];
		int bought[] = new int[K];
		for (int i = 0; i < N; i++) {
			C[i] = in.nextInt();
		}

		int result = 0;
		//sort the array in descending order
		Arrays.sort(C, new Comparator<Integer>() {
			@Override
			public int compare(Integer x, Integer y) {
				return y - x;
			}
		});
		int index = 0;
		for (int i = 0; i < C.length; i++) {
			// reset if crossed boundry
			if (index >= bought.length)
			{
				index = 0;
			}
			result += ((bought[index] + 1) * C[i]);
			bought[index] += 1;
			index++;

		}
		
		System.out.println(result);
		in.close();
	}

}
