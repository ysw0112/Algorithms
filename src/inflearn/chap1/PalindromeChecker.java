package inflearn.chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeChecker {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.print(solution(input));
    }
    public static final String solution(String input){

        String[] splitString = input.split("");
        int right = splitString.length - 1;
        for (int left = 0; left < splitString.length/2; left++) {
            if(!splitString[left].equalsIgnoreCase(splitString[right--])) return "NO";
        }
        return "YES";
    }
}
