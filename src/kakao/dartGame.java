package kakao;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dartGame {

    public static String solution(String input) {
        String result = "";
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                result = result + c;
            } else {
                result = result + "!!!!";
            }
        }
        System.out.println(result);
//        String patternStr = "([\\d+])";
//        Pattern pattern = Pattern.compile(patternStr);
//        Matcher matcher = pattern.matcher(input);
//        while(matcher.find()) {
//            result += "\t" + matcher.group(0);
//        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution("10S2D*3T"));
    }
}
