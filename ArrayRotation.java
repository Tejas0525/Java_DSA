
 import java.util.*;
 class ArrayRotation{
    
    static void solution(int []arr,int n,int k){
        //write your code here
        int abc[]=new int[n];
        int e=arr.length-1;
        for(int i=k;i<=e;i++){
            abc[i-k]=arr[i];
        }
        for(int j=0;j<k;j++){
            abc[k+j]=arr[j];
        }

        for(int z=0;z<arr.length;z++){
            System.out.print(abc[z]+" ");
        }
    }
        
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element of array");
        for (int i=0 ; i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter k value:");
        int k=sc.nextInt();
        solution(arr,n,k);
    }
 }