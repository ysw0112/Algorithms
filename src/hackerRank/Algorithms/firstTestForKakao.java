package hackerRank.Algorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    /*
     * Complete the 'maxStreak' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER m
     *  2. STRING_ARRAY data.txt
     *  4
     *  5
     *  YYYY
     *  YYYY
     *  NYYY
     *  YYNN
     *  YYYY
     */

    public static int maxStreak(int m, List<String> data) {
        // Write your code here
        int maximum = 0;
        int count = 0;

        for (int i = 0; i < data.size(); i++) {

            if (m == data.get(i).length() && data.get(i).toUpperCase().matches("^Y*$")) {
                count++;
            }

            if (count > maximum) {
                maximum = count;
            } else {
                count = 0;
            }
        }
        return maximum;
    }

}

public class firstTestForKakao {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
//        System.out.println("YY".matches("^Y*$"));
        int m = Integer.parseInt(bufferedReader.readLine().trim());

        int dataCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> data = new ArrayList<>();

        for (int i = 0; i < dataCount; i++) {
            String dataItem = bufferedReader.readLine();
            data.add(dataItem);
        }

        int result = Result.maxStreak(m, data);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

