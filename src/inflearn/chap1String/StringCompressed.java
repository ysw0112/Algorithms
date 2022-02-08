package inflearn.chap1String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//입력 - KKHSSSSSSSE
//출력 - K2HS7E
public class StringCompressed {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input));
    }

    private static String solution(String input) {
        StringBuilder answer = new StringBuilder();
        char[] charArray = (input+" ").toCharArray();

        int cnt = 1;
        for (int i = 0; i < charArray.length-1; i++) {
            if(charArray[i] == charArray[i+1])  cnt++;
            else{
                answer.append(charArray[i]);
                if(cnt > 1) answer.append(cnt);
                cnt = 1;
            }
        }
        return answer.toString();
    }

}
