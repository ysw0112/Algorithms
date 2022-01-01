package baekjun.forth;

import java.io.IOException;
import java.util.Scanner;

public class beakjoon1546 {
    public static void main(String[] args) throws IOException {
        Scanner c = new Scanner(System.in);
        int cnt = c.nextInt();
        int score[] = new int[cnt];
        double changeScore[] = new double[cnt];
        int sum = 0;
        int maxScore = 0;

        for (int i = 0; i < cnt; i++) {
            score[i] = c.nextInt();
            if (maxScore < score[i]) {
                maxScore = score[i];
            }
        }

        for (int i = 0; i < score.length; i++) {
            changeScore[i] = Double.parseDouble(String.format("%.2f", (double) score[i] / maxScore)) * 100;
            sum += changeScore[i];
        }
        System.out.println(String.format("%.2f", (double) sum / cnt));
    }
}
