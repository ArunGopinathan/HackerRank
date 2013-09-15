/**
 * 
 */
package hackerRank;

/**
 * @author Arun.G
 *
 */
/* Head ends here */
import java.util.*;
public class InsertionSortPart1 {

	/**
	 * @param args
	 */
	 static void insertionSort(int[] ar) {
         
         int newvalue = ar[ar.length-1];
      for(int i=ar.length-1;i>0;i--)
      {
          if(newvalue<ar[i-1])
          {
           ar[i]=ar[i-1];
           printArray(ar);  
          }
          else
          {
              ar[i]=newvalue;
               printArray(ar);
              return;
          }   
      }
      ar[0] = newvalue;
      printArray(ar);
        
  }  
	 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
      
/* Tail starts here */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
           ar[i]=in.nextInt();
        }
        insertionSort(ar);
	}

}
