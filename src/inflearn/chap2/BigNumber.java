package inflearn.chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//입력 7 3 9 5 6 12
//출력 7 9 6 12
public class BigNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input));
    }

    private static String solution(String input) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> inputValues = Arrays.stream(input.split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        for (int i = 0; i < inputValues.size(); i++) {
            if(i == 0) answer.add(inputValues.get(i));
            else if(inputValues.get(i-1) < inputValues.get(i)) answer.add(inputValues.get(i));
        }
        return answer.stream().map(String::valueOf).collect(Collectors.joining(" "));
    }
}
