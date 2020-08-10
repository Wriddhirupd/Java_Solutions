import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			  String pattern = in.nextLine();
            PatternSyntaxException exc = null;
            try{
                Pattern.compile(pattern);
            }catch(PatternSyntaxException e) {
                exc = e;
            }
            if (exc != null) {
                System.out.println("Invalid");
            } else {
                System.out.println("Valid");
            }
            testCases--;
		}
	}
}



