package inflearn.chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//입력 130 135 148 140 145 150 150 153
//출력 5
public class VisibleStudent {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input));
    }

    private static int solution(String input) {
        int answer = 0;
        List<Integer> inputValues = Arrays.stream(input.split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        int max = 0;
        for (int i = 0; i < inputValues.size(); i++) {
            if(inputValues.get(i) > max) {
                answer++;
                max = inputValues.get(i);
            }
        }
        return answer;
    }
}
