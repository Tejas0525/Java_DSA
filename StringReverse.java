import java.util.*;

public class StringReverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        int len=A.length();
        String rev="";

        for(int i=len-1;i>=0;i--){
            rev=rev + A.charAt(i);
        }
        if(A.equals(rev)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
