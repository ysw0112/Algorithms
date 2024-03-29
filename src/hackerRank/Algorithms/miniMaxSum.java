package hackerRank.Algorithms;

import java.util.*;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class miniMaxSum {
    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
//        long minimum = 0;
//        long maximum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            int temp = -1;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;import java.util.stream.Collectors;
//                }
//            }
//        }
//
//        for (int i = 1; i < arr.length; i++) {
//            maximum += arr[i];
//        }
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            minimum += arr[i];
//        }
//        List<Long> collect = Arrays.stream(arr).mapToLong(x -> x).sorted().boxed().collect(Collectors.toList());
//
//        long min = Collections.min(collect);
//        long max = Collections.max(collect);
//        long sum = collect.stream().reduce(0L, Long::sum);
//        long minimum = sum - max;
//        long maximum = sum - min;
//
//        System.out.println(minimum + " " + maximum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
