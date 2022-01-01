package programmers;

import java.util.Arrays;

public class 전화번호목록 {
    public static void main(String[] args) {
        String a = "119";
        String b = "1231195522442";
        String c = "1234";


        String[] book = {"12", "134", "413", "231134"};
        System.out.println(solution(book));
    }

    static boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = i + 1; j < phone_book.length; j++) {
                if (i == j) continue;
                if (phone_book[j].contains(phone_book[i])) {
                    answer = false;
                    return answer;
                }
            }
        }
        return answer;
    }
}
