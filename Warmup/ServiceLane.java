/**
 * 
 */
package hackerRank;

import java.util.Scanner;

/**
 * @author Arun.G
 *
 */
public class ServiceLane {

	/**
	 * @param args
	 */
	//function which returns the minimum element between indexes in an array
	public static int findMin(int[] array, int startIndex, int endIndex)
    {
    int min = Integer.MAX_VALUE;
    for(int i = startIndex;i<=endIndex;i++)
        {
        if(array[i]<min)
            min = array[i];
    }
    return min;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int T = sc.nextInt();
	        //declare lane segment array to store width of n elements
	        int[] laneSegments = new int[N];
	        //get the width into array
	        for(int i=0;i<N;i++)
	            {
	            laneSegments[i]= sc.nextInt();
	        }
	       
	        //T Test Cases to handle
	        for(int k=0;k<T;k++)
	            {
	            int i = sc.nextInt();
	            int j = sc.nextInt();
	            /*find the minimum of the lane segment width, 
	             * that is the maximum size of the vehicle
	            that can pass through*/
	            System.out.println(findMin(laneSegments,i,j));
	        }
	        sc.close();
	}

}
