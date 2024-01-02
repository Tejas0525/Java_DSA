import java.io.*;
import java.util.*;


class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
            Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        String[] daysOfWeek = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY","FRIDAY", "SATURDAY"};
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1; 

        return daysOfWeek[dayOfWeek];
            
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int month = Integer.parseInt(br.redLine());

        int day = Integer.parseInt(br.redLine());

        int year = Integer.parseInt(br.redLine());

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
