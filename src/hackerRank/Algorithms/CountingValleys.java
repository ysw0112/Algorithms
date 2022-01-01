package hackerRank.Algorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int result = 0;
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

//    int n = scanner.nextInt();
//    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//    String s = scanner.nextLine();
//
//    int result = countingValleys(n, s);
//    System.out.println(result);
//    scanner.close();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char[] hike = scan.next().toCharArray();

        int count = 0;
        int altitude = 0;

        for (char c : hike) {
            // Step up
            if (c == 'U') {
                if (altitude == -1) {
                    count++;
                }
                altitude++;
            }
            // Step down
            else {
                altitude--;
            }
        }

        scan.close();

        System.out.println(count);

    }
}
