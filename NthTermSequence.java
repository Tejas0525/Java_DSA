/* 
Nth term in Sequence
For a unique sequence, you have to find the nth term of the sequence. The unique sequence is the sequence of the below integers: 
1, 11, 21, 1211, 111221, 312211, 13112221, 1113213211,...
The nth term of the series is generated by reading (n-1)'th term.
The first term is "1".
The second term is "11", generated by reading the first term as "One 1" (There is one 1 in the previous term)
The third term is "21", generated by reading the second term as "Two 1"
The fourth term is "1211", generated by reading the third term as "One 2 One 1"
and so on

Note:
You need to complete the given function.
Input Format
The only line contains a single integer N.
Output Format
Return a string depicting the nth term of the series.

Example 1
Input
3
Output
21
Explanation The third term of the series is 21.

Example 2 Input
5
Output
111221 Explanation
The fifth term of the series is 111221.

Constraints 1 <= n <= 30
*/


import java.util.*;
class NthTerm{
    static String solution(int n){
        //write your code here
        

        return "";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        System.out.println(sloution(n));
}