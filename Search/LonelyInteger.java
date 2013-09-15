/**
 * 
 */
package hackerRank;

/**
 * @author Arun.G
 *
 */
import java.util.Scanner;
public class LonelyInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        //getting all the numbers
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        //assigning 0th element as unique
        int unique=0;
        unique=arr[0];
        /* xor with number is like subraction 1^1  is 0
         * so 1^1^0^3^0 is = 1-1+0+3-0
        */
        for(int i=1;i<arr.length;i++)
        {
           unique^=arr[i];
        }
        System.out.println(unique);
        
        sc.close();
	}

}
