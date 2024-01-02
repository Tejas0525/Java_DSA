/*
 Array Rotation
 Given an array with N elements, the task is to rotate the array to the left by K steps without using any extra space, where K is non-negative
 Input Format
The first line contains an integer N representing the size of the array
The second line contains N space-separated integers representing the elements of the array
The last line contains an integer K representing the number of times the array has to be rotated in the left direction.
Output Format
The only line of the output prints N space-separated integers representing the Rotated array elements.
Note: You need to complete the given function.
Example 1
Input
8
7 5 2 11 2 43 1 1
2
Output 
2 11 2 43 1 1 7 5
Explanation Rotate 1 steps to the left: 5 2 11 2 43 1 1 7
Rotate 2 steps to the left: 2 11 2 43 1 17 5
}
Example 2 
Input
8
7 5 2 11 2 43 1 1
3
Output 
11 2 43 1 1 7 5 2 
Explanation
Rotate 1 steps to the left: 5 2 11 2 43 1 1 7
Rotate 2 steps to the left: 2 11 2 43 1 1 7 5
Rotate 3 steps to the left: 11 2 43 1 1 7 5 2
 */

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