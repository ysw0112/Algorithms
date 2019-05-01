package hackerRank.Algorithms;

import java.util.*;
import java.io.*;

public class diagonalDifference {
    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
        int left = 0;
        int right = 0;
        int result = 0;

        for(int i=0; i<arr.length; i++){
            left += arr[i][i];
        }

        for(int i=0; i<arr.length; i++){
            right += arr[i][arr.length - i - 1];
        }
        result = Math.abs(left - right);
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
