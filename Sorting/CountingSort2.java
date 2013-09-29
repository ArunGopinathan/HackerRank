/**
 * 
 */
package hackerRank;

import java.util.Scanner;

/**
 * @author Arun.G
 *
 */
public class CountingSort2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numberCount[] = new int[100];
        //track the number count
        for(int i=0;i<n;i++)
        {
            int number = sc.nextInt();
            numberCount[number]+=1;
        }
        //print numbers for which count is greater than zero
        for(int i=0;i<numberCount.length;i++)
        {
            for(int j=0;j<numberCount[i];j++)
                System.out.print((i+1)+" ");
        }
	}

}
