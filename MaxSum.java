import java.util.*;
class MaxSum{
    static int solution(int a[],int n,int k){
        int sum=0;
        int max=0;
        int h=n-k;
       for(int i=0;i<h;i++){
            sum+=a[i];
        }
        max=sum;
        int m=0;
        for (int j=h;j<n;j++) {
            sum-=a[m];
            sum+=a[j];

            if(max<sum){
                max=sum;
            }
            m++;
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        System.out.println("Enter k value:");
        int k=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the element of array");
        for (int i=0 ; i<n;i++){
            a[i]=sc.nextInt();
        }
        int ans=solution(a,n,k);
        System.out.println("Output: "+ans);
        sc.close();
    }
}