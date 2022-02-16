package inflearn.chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mentoring {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> input = Arrays.stream(br.readLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        int studentCount = input.get(0).intValue();
        int testCount = input.get(1).intValue();
        int[][] mentoArray = new int[testCount][studentCount];

        for (int i = 0; i < testCount; i++) {
            int[] s = Arrays.stream(br.readLine().split(" ")).map(Integer::valueOf).mapToInt(t -> t).toArray();
            for (int j = 0; j < studentCount; j++) {
                mentoArray[i][j] = s[j];
            }
        }
        solution(mentoArray, studentCount, testCount);
    }

    private static void solution(int[][] mentoArray, int studentCount, int testCount) {
        int answer = 0;
        for (int i = 1; i <= studentCount; i++) {
            for (int j = 1; j <= studentCount; j++) {
                if(i == j) continue;
                int isMento = 0;
                for (int k = 0; k < testCount; k++) {
                    int mento = 0, menti = 0;
                    for (int l = 0; l < studentCount; l++) {
                        if(mentoArray[k][l] == i) mento = l;
                        if(mentoArray[k][l] == j) menti = l;
                    }
                    if(mento < menti) isMento++;
                }
                if(isMento == testCount) {
                    answer ++;
                }
            }
        }
        System.out.println(answer);
    }

}
