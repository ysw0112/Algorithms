package hackerRank.Algorithms;

import java.util.*;
import java.io.*;

public class birthdayCakeCandles {
    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        int years = ar.length;
        int count = 0;
        int max = -1;

        for (int i = 0; i < years; i++) {
            if (max < ar[i]) max = ar[i];
        }
        for (int i = 0; i < years; i++) {
            if (max == ar[i]) count++;
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
