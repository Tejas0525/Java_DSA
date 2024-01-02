import java.util.Scanner;
import java.util.Scanner.*;

class AnagramString{
    static boolean checkAnagram(String a,String b){
        String A=a.toLowerCase();
        String B=b.toLowerCase();

        int arr1[]=new int[30];
        int arr2[]=new int[30];

        if(A.length()==B.length()){
            for(int i=0;i<A.length();i++){
                arr1[(int)A.charAt(i)-97]+=1;
                arr2[(int)B.charAt(i)-97]+=1;
            }

            for(int i=0;i<30;i++){
                if(arr1[i]!=arr2[i])return false;
            }
            return true;
        }
        else{
            return false;
        }

    /*
        String A=a.toLowerCase();
        String B=b.toLowerCase();
        char arr1[]=A.toCharArray();
        char arr2[]=B.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean result=Arrays.equals(arr1,arr2);
        return result;
    */
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        sc.close();
        boolean ret=checkAnagram(a,b);
        System.out.println((ret) ? "Anagram" : "Not Anagram");
    }
}