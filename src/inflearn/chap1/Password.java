package inflearn.chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//입력 #****###**#####**#####**##**
//출력 COOL
public class Password {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input));
    }

    private static String solution(String input) {
        String answer = "";
        String[] splitToReplaceString = input.replace('#', '1').replace('*', '0').split("");
        String tmp = "";
        int cnt = 1;
        for (int i = 0; i < splitToReplaceString.length; i++) {
            tmp += splitToReplaceString[i];
            if(cnt % 7 == 0) {
                char c = (char) Integer.valueOf(tmp, 2).intValue();
                answer += Character.toString(c);
                tmp = "";
            }
            cnt++;
        }
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {

        }
        return answer;
    }
}
