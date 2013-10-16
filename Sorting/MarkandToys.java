/**
 * 
 */
package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Arun.G
 *
 */
public class MarkandToys {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		//get n and k
        int n= sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];
        //get the elements in array
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();  
        }
        //sort it in ascending order
        Arrays.sort(arr); 
        //see how many low cost toys we can buy with the money
        int count=0;int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum += arr[i];
           if(sum>k)
                break;
           else
               count++; 
        }
        //print the result
        System.out.println(count);
        
        //close the scanner
        sc.close();
	}

}
