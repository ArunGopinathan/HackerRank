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
public class DetecttheEmailAddresses {

	/**
	 * @param args
	 */
	//for printing the email's separated by Semicolon
    public static void printList(ArrayList<String> list)
    {
        String result="";
        for(String email : list)
        {
            result+= email+";";
        }
        //remove the last semicolon
        result = result.substring(0,result.length()-1);
        System.out.println(result);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        int no = sc.nextInt();
        while(no-->=0)
        {
            String word = sc.nextLine();
            if(!word.equals(""))
            {
                String emailPattern ="(\\b[a-z_.]{1,}@[a-z.]*[a-z]{1,3}\\b)";
                Pattern pattern = Pattern.compile(emailPattern,Pattern.CASE_INSENSITIVE);
                Matcher m = pattern.matcher(word);
                while(m.find())
                {
                    String emailAddress = m.group(1);
                    if(!list.contains(emailAddress))
                        list.add(emailAddress);
                }
                   
            }
        }
        Collections.sort(list);
        printList(list);
    }
}

