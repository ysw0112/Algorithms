package inflearn.chap7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
입력
5 9
1 2
1 3
1 4
2 1
2 3
2 5
3 4
4 2
4 5
 */
public class Example12 {
    static int answer = 0;
    static List<ArrayList<Integer>> lines;
    static int[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int pointCount = Integer.valueOf(input[0]).intValue();
        int lineCount = Integer.valueOf(input[1]).intValue();

        lines = new ArrayList<>();
        check = new int[pointCount+1];

        for (int i = 0; i <= pointCount; i++) {
            lines.add(new ArrayList<>());
        }
        for (int i = 0; i < lineCount; i++) {
            String[] line = br.readLine().split(" ");
            int startPoint = Integer.valueOf(line[0]).intValue();
            int endPoint = Integer.valueOf(line[1]).intValue();
            lines.get(startPoint).add(endPoint);
        }

        DFS(1, pointCount);
        System.out.println(answer);
    }

    private static void DFS(int start, int target) {
        if(start == target){
           answer++;
        }else{
            if(check[start] == 1) return;
            ArrayList<Integer> current = lines.get(start);
            for (int i = 0; i < current.size(); i++) {
                Integer value = current.get(i);
                check[start] = 1;
                DFS(value, target);
                check[start] = 0;
            }
        }
    }
}
