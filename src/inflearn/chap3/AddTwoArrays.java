package inflearn.chap3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddTwoArrays {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int firstArrayCount = Integer.valueOf(br.readLine()).intValue();
        List<Integer> first = Arrays.stream(br.readLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        int secondArrayCount = Integer.valueOf(br.readLine()).intValue();
        List<Integer> second = Arrays.stream(br.readLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        solution(first, second);
    }

    private static void solution(List<Integer> first, List<Integer> second) {
        first.addAll(second);
        List<Integer> sortedList = first.stream().sorted().collect(Collectors.toList());
        for (Integer integer : sortedList) {
            System.out.print(integer.intValue()+ " ");
        }
    }
}
