/**
 * 
 */
package hackerRank;

/**
 * @author Arun.G
 *
 */
import java.util.Scanner;
import java.util.regex.*;
public class HackerrankLanguage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); int count=0;
        while(sc.hasNextLine())
        {
            String lines = sc.nextLine();
           
            if(!lines.equals(""))
            {
              String line[] = lines.split(" ");
           
              String pattern ="\\b(C|CPP|JAVA|PYTHON|PERL|PHP|RUBY|CSHARP"+
                "|HASKELL|CLOJURE|BASH|SCALA|ERLANG|CLISP|LUA|"+
                "BRAINFUCK|JAVASCRIPT|GO|D|OCAML|R|PASCAL|SBCL|DART|GROOVY|OBJECTIVEC)\\b";
           
              Pattern hiPattern = Pattern.compile(pattern,Pattern.CASE_INSENSITIVE);
              Matcher m = hiPattern.matcher(line[1]);
              if(m.find())
              {
                     System.out.println("VALID");
              }
              else
              {
                     System.out.println("INVALID");
              }
                                                                             
            }    
              
        }
        sc.close();
	}

}
