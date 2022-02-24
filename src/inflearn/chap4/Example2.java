package inflearn.chap4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
아나그램
Anagram이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 합니다.

입력
AbaAeCe
baeeACA
출력
YES
 */
public class Example2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String value1 = br.readLine();
        String value2 = br.readLine();
        System.out.println(solution(value1, value2));
    }

    private static String  solution(String value1, String value2) {
        char[] chars1 = value1.toCharArray();
        char[] chars2 = value2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        for (int i = 0; i < chars1.length; i++) {
            if(chars1[i] != chars2[i]) return "NO";
        }
        return "YES";
    }
}
