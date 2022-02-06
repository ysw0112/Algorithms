package inflearn.chap1String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExcludeDuplicatedString {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input));
    }

    public static String solution(String input) {
        String answer = "";
        char[] chars = input.toCharArray();
        for (char aChar : chars) {
            if(answer.indexOf(aChar) < 0) answer+=aChar;
        }
        return answer;
    }
}
