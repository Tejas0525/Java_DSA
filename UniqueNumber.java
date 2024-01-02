import java.util.*;
class UniqueNumber {
    static int solution(int a[],int n){
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]!=a[j]){
                        temp=a[j];
                }
            }
        }
        return temp;
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
    int ans=solution(a,n);
    System.out.println(ans);
    }
}