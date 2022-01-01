package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class K번째수 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}};
//        System.out.println(commands.length);
        System.out.println(solution(array, commands));
    }

    static int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int firstSplit = commands[i][0];
            int lastSplit = commands[i][1];
            int resultNumberIndex = commands[i][2];
            List<Integer> list = new ArrayList<>();

            for (int j = firstSplit - 1; j < lastSplit; j++) {
                list.add(array[j]);
            }

            Collections.sort(list);
            answer[i] = list.get(resultNumberIndex - 1);
        }

        return answer;
    }
}
