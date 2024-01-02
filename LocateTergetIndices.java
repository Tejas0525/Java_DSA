import java.util.*;

class LocateTargetIndices{
    static void solution(int[]arr,int n,int k){
        Arrays.sort(arr);
        ArrayList al = new ArrayList();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                al.add(i);
            }
        }
         Iterator itr=al.iterator();  
        while(itr.hasNext()){
             System.out.println(itr.next());
        }
    }
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[]{1,2,5,2,3};
        solution(arr,n,k);
    }
}