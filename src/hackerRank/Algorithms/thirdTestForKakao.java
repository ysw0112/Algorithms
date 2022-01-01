package hackerRank.Algorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result3 {

    /*
     * Complete the 'findSchedules' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER workHours
     *  2. INTEGER dayHours
     *  3. STRING pattern
     *  56
     *  8
     *  ???8???
     */

    public static List<String> findSchedules(int workHours, int dayHours, String pattern) {
        // Write your code here
        List<String> result = new ArrayList<>();
        int workDayCount = 0;
        int patternSum = 0;

        for (int i = 0; i < 7; i++) {
            if (pattern.charAt(i) == 63) {
                workDayCount++;
            } else {
                patternSum += Integer.parseInt(pattern.substring(i, i + 1));
            }
        }

        int a = workHours - patternSum;


        System.out.println(patternSum);
        return result;
    }

}

public class thirdTestForKakao {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int workHours = Integer.parseInt(bufferedReader.readLine().trim());

        int dayHours = Integer.parseInt(bufferedReader.readLine().trim());

        String pattern = bufferedReader.readLine();

        List<String> result = Result3.findSchedules(workHours, dayHours, pattern);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(result.get(i));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

