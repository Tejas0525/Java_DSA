import java.util.*;

class StringIntro{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int lengthOfStrings=A.length() + B.length();
        String s1=A.substring(0,1).toUpperCase()+A.substring(1);
        String s2=B.substring(0,1).toUpperCase()+B.substring(1);
        
        System.out.println(lengthOfStrings);
        
        if(A.charAt(0)>B.charAt(0)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        System.out.println(s1+ " "+ s2);
    }
}