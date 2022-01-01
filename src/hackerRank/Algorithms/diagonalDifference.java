package hackerRank.Algorithms;

import static java.util.stream.Collectors.toList;

import java.util.*;
import java.io.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class diagonalDifference {
    // Complete the diagonalDifference function below.
    static int diagonalDifference(List<List<Integer>> arr) {
        int left = 0;
        int right = 0;
        int result = 0;

        for (int i = 0; i < arr.size(); i++) {
            left += arr.get(i).get(i);
        }

        for (int i = 0; i < arr.size(); i++) {
            right += arr.get(i).get(arr.size() -1 -i);
        }

        result = Math.abs(left - right);
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
