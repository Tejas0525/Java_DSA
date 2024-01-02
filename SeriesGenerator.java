import java.util.*;

class SeriesGenerator{

    static void generateSeries(int a,int b, int n){
        int val=a;
        for(int i=0;i<n;i++){
            val+=(Math.pow(2,i)*b);
            System.out.print(val+" ");
        }
        System.out.println();
    }
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            generateSeries(a,b,n);
            
        }
    }
}