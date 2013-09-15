/**
 * 
 */
package hackerRank;

/**
 * @author Arun.G
 *
 */
import java.util.*;
public class InsertionSortPart2 {

	/**
	 * @param args
	 */
	public static void insertionSort(int[] ar){

        int index =0;
        for(int i=1;i<ar.length;i++)
        {
            int number = ar[i];
            index++;
            insertionSort2(ar,index);
        }
       
}
 public static void insertionSort2(int[] ar,int index)
 {
     for(int i=0;i<=index;i++)
     {
         if(ar[i]> ar[index])
         {
             int temp=0;
             temp = ar[index];
             ar[index]=ar[i];
             ar[i]=temp;
         }
         else
         {
             continue;
         }
    
     }
    printArray(ar);
       
 }
/* Tail starts here */
static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
           ar[i]=in.nextInt();
        }
        insertionSort(ar);
        in.close();
	}
	

}
