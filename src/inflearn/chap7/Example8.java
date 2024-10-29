package inflearn.chap7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Example8 {

    static int[] POSSIBLE_VALUES = {1, -1, 5};
    static int[] CHECK = new int[10001];
    static Queue<Integer> QUEUE = new LinkedList<>();
    static int LEVEL = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int start = Integer.valueOf(input[0]).intValue();
        int target = Integer.valueOf(input[1]).intValue();
        System.out.println(BFS(start, target));
    }

    //Runtime error
    private static int BFS(int start, int target) {
        CHECK[start]=1;
        QUEUE.offer(start);

        while (!QUEUE.isEmpty()){
            int size = QUEUE.size();
            for (int i = 0; i < size; i++) {
                Integer current = QUEUE.poll();
                if (current == target) {
                    return LEVEL;
                }

                for (int j = 0; j < POSSIBLE_VALUES.length; j++) {
                    int afterJump = POSSIBLE_VALUES[j] + current;
                    if (CHECK[afterJump] == 0 && afterJump > 0 && afterJump < 10001){
                        CHECK[afterJump] = 1;
                        QUEUE.offer(afterJump);
                    }
                }
            }
            LEVEL++;
        }
        return 0;
    }
}
