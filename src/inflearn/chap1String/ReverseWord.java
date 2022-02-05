package inflearn.chap1String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseWord {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int inputCount = Integer.valueOf(br.readLine()).intValue();
            for (int i = 0; i < inputCount; i++) {
                System.out.println(reversSpecialWord(br.readLine()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //모든 문자 뒤집기
    public static String reverseAll(String value) {
//        new StringBuilder(value).reverse();
        char[] chars = value.toCharArray();
        int length = chars.length;
        for (int i = 0; i < length/2; i++) {
            char lChar = chars[i];
            char rChar = chars[length-i-1];
            chars[i] = rChar;
            chars[length-i-1] = lChar;
        }
        return new String(chars);
    }

    //특정 문자 뒤집기
    public static String reversSpecialWord(String value){
        char[] chars = value.toCharArray();
        int left = 0;
        int right = chars.length-1;
        while (left < right){
            char lChar = chars[left];
            char rChar = chars[right];
            if(isEnglish(lChar) && isEnglish(rChar)){
                chars[left] = rChar;
                chars[right] = lChar;
                left++;
                right--;
            } else if(isEnglish(lChar)){
                right--;
            } else if(isEnglish(rChar)){
                left++;
            }else {
                left++;
                right--;
            }
        }
        return new String(chars);
    }

    private static boolean isEnglish(char value) {
        if ((value >= 'a' && value <= 'z') || (value >= 'A' && value <= 'Z')) {
            return true;
        }
        return false;
    }
}
