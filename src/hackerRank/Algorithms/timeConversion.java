package hackerRank.Algorithms;

import java.util.*;
import java.io.*;

public class timeConversion {
    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String result = "";

        result = s.substring(0, 8);
        int hour = Integer.parseInt(s.split(":")[0]);
        if (s.matches("(.*)(PM)")) {
            if (hour != 12) {
                hour += 12;
                result = result.replace(String.valueOf(s.split(":")[0]), String.valueOf(hour));
            }
        } else if (s.matches("(.*)(AM)")) {
            if (hour == 12) {
                result = result.replace(String.valueOf(s.split(":")[0]), String.valueOf("00"));
            }
        }
        return result;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
