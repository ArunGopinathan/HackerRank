/**
 * 
 */
package hackerRank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Arun.G
 *
 */
public class IPAddressValidation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        //Regex expression for Ipv4
        String ip4Regex="^(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[0-9]{1,2})(\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[0-9]{1,2})){3}$";
        Pattern ip4Pattern = Pattern.compile(ip4Regex);
        //Regex expression for Ipv6
        String ip6Regex="^([0-9A-Fa-f]{1,4}:){7}[0-9A-Fa-f]{1,4}$";
        Pattern ip6Pattern = Pattern.compile(ip6Regex);
            
        Matcher matcher;
        for(int i=0;i<=n;i++)
        {
            String line = sc.nextLine();
            if(!line.equals(""))
            {
                matcher = ip4Pattern.matcher(line);
                //check if it is a Ipv4 Address
                if(matcher.matches())
                    System.out.println("IPv4");
                else
                {
                    matcher = ip6Pattern.matcher(line);
                    //check if it is Ipv6 Address
                    if(matcher.matches())
                        System.out.println("IPv6");
                    else //else it is neither
                        System.out.println("Neither");
                }
            }
        }
        //close the scanner
        sc.close();
	}

}
