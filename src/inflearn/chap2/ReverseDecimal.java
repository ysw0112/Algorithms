package inflearn.chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
입력
9 - 자연수의 개수
32 55 62 20 250 370 200 30 100 - 입력된 자연수
출력
23 2 73 2 3 - 출력된 자연수

입력된 자연수를 뒤집어서 해당 하는 수가 소수인지 판단하고 해당 숫자 출력
예) 910 -> 019 , 첫째 자리 0은 무시하고 19가 소수 인지 판단 후 출력
*/
public class ReverseDecimal {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cnt = Integer.valueOf(br.readLine());
        String input = br.readLine();
        solution(input);
    }

    private static void solution(String input) {
        List<Integer> collect = Arrays.stream(input.split(" "))
                                      .map(value -> new StringBuilder(value).reverse().toString())
                                      .map(Integer::valueOf)
                                      .collect(Collectors.toList());

        for (int i = 0; i < collect.size(); i++) {
            int value = collect.get(i).intValue();
            if (value == 0 || value == 1) continue;
            if (isPrime(value)) {
                System.out.print(value + " ");
            }
        }
    }
    // 해당 숫자의 √N 까지 확인하는 방법
    // 2부터 √N 까지만 검색하면 이후 값은 확인 할 필요가 없음 시간 복잡도가 O(√N)으로 최적화 됨
    public static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
