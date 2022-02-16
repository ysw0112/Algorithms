package inflearn.chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

//입력 - teachermode e
//출력 - 1 0 1 2 1 0 1 2 2 1 0
public class ShortLength {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        String inputValue = split[0];
        String findString = split[1];
        String collect = Arrays.stream(solution(inputValue, findString)).mapToObj(String::valueOf).collect(Collectors.joining(" "));
        System.out.println(collect);
    }

    private static int[] solution(String inputValue, String findValue) {
        int[] answer = new int[inputValue.length()];
        String[] split = inputValue.split("");
        int tmp = 200;
        for (int i = 0; i < split.length; i++) {
            if (split[i].equalsIgnoreCase(findValue)) {
                tmp = 0;
            } else {
                tmp++;
            }
            answer[i] = tmp;
        }
        tmp = 200;
        for (int i = split.length - 1; i >= 0; i--) {
            if (split[i].equalsIgnoreCase(findValue)) {
                tmp = 0;
            } else {
                tmp++;
            }
            answer[i] = Math.min(answer[i], tmp);
        }
        return answer;
    }
}
