package baekjun.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class baekjoon2798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input1 = br.readLine().split(" ");
        int size = Integer.valueOf(input1[0]).intValue();
        int target = Integer.valueOf(input1[1]).intValue();
        int max = 0;

        List<Integer> collect = Arrays.stream(br.readLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        for (int i = 0; i < size - 2; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                for (int k = j + 1; k < size; k++) {
                    int sum = collect.get(i) + collect.get(j) + collect.get(k);
                    if (target == sum) {
                        max = sum;
                        System.out.println(max);
                        return;
                    }
                    if (sum > target) {
                        continue;
                    }
                    if (max < sum) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
