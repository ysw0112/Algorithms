package inflearn.chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//입력 found7, time: study; Yduts; emit, 7Dnuof
//출력 YES
public class PalindromeString {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input.toLowerCase()));
    }

    public static final String solution(String input) {
        char[] inputCharValues = input.toCharArray();
        int left = 0;
        int right = inputCharValues.length - 1;
        while (left < right) {
            if (!Character.isAlphabetic(inputCharValues[left])) {
                left++;
            } else if (!Character.isAlphabetic(inputCharValues[right])) {
                right--;
            } else {
                if (inputCharValues[left] != inputCharValues[right]) {
                    return "NO";
                }
                left++;
                right--;
            }
        }
        return "YES";
    }
}
