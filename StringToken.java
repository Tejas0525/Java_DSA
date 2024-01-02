import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Scanner.*;
public class StringToken {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        // Tokenizing a string using delimiter as space
        String delim=" ,',?,!,@,#,$,%,^,&,*,+,|,\n,\t";
        StringTokenizer tokens=new StringTokenizer(s,delim);
        System.out.println(tokens.countTokens());
        while(tokens.hasMoreTokens()){
            System.out.println(tokens.nextToken());
        }

    }
}
