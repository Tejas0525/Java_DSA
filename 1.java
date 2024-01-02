import java.io.*;

class TestClass {

    static int solution(int teams,int stud,int[]arr){
        int t=0;
        int j=0;
        int n=0;
        for (int i=0;i<students;i++){
            while(arr[j]==0){
                t++;
                j++;
            }
            n=t/2;
        }
        return n;

    }

    public static void Main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int teams=Integer.parseInt(br.readLine());
        int Stud=Integer.parseInt(br.readLine());
        int arr[]=new int[stud];
        for (int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        int ans =solution(teams,stud,arr);
        System.out.println(ans);
    }
    
}
