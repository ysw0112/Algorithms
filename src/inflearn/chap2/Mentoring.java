package inflearn.chap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
M번의 수학성적이 주어지면 멘토와 멘티가 되는 짝을 만들 수 있는 경우가 총 몇 가지 인지 출력
멘토는 멘티보다 모든 테스트에서 성적이 앞서야 한다.
입력
N = 4, M = 3
3 4 1 2
4 3 2 1
3 1 4 2
출력
3
 */
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
