import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
          	
      //Write your code
            try{
                Pattern p=Pattern.compile(pattern);
                Matcher matcher=p.matcher(pattern);
                boolean b=matcher.find();
                if(b){
                    System.out.println("Valid");
                }
            }catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }
            testCases--;
		}
	}
}