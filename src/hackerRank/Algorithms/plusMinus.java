package hackerRank.Algorithms;

import java.text.Format;
import java.util.*;

public class plusMinus {
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        float fennel = arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println(String.format("%.6f", positive / fennel));
        System.out.println(String.format("%.6f", negative / fennel));
        System.out.println(String.format("%.6f", zero / fennel));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
