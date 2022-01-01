package programmers;

import java.util.ArrayList;
import java.util.List;

public class 모의고사 {
    public static void main(String[] args) {
        // int[] supoja1 = {1, 2, 3, 4, 5};
        // int[] supoja2 = {2, 1, 2, 3, 2, 4, 2, 5,};
        // int[] supoja3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] answer = {1, 2, 3, 4, 5};
        System.out.println(solution(answer));
    }

    static int[] solution(int[] answers) {
        int[] answer = {2, 1, 2, 3, 2};
        int[] supoja1 = {1, 2, 3, 4, 5};
        int[] supoja2 = {2, 1, 2, 3, 2, 4, 2, 5,};
        int[] supoja3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] result = {0, 0, 0};

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == supoja1[i % 5]) {
                result[0]++;
            }

            if (answer[i] == supoja2[i % 8]) {
                result[1]++;
            }

            if (answer[i] == supoja3[i % 10]) {
                result[2]++;
            }
        }
        int max = Math.max(result[0], Math.max(result[1], result[2]));
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < result.length; i++)
            if (max == result[i]) list.add(i + 1);

        answer = new int[list.size()];
        int cnt = 0;
        for (int num : list)
            answer[cnt++] = num;

        for (int num : list)
            System.out.println(num);

        return answer;
    }
}
