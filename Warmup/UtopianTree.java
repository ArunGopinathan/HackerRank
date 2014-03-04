/**
 * 
 */
package hackerRank;

import java.util.Scanner;

/**
 * @author Arun.G
 *
 */
public class UtopianTree {

	/**
	 * @param args
	 */
	private static int UtopianHeight(int noOfCycles)
    {
    int height=1;
    if(noOfCycles<=0)
        return 1; // no change of height
    for(int i=1;i<=noOfCycles;i++)
        {
        if(i%2!=0)
            height=2*height; //doubles in odd cycles
        else
            height+=1; // increases by 1 in even cycles
    }
    return height;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int noOfTestCases = sc.nextInt();
        for(int i=0;i<noOfTestCases;i++)
            {
        	int noOfCycles = sc.nextInt();
            System.out.println(UtopianHeight(noOfCycles));
        }
        sc.close(); //close scanner
	}

}
