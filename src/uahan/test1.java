package uahan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1 {
    public static void solution(int U, int L, int[] c) {

    }

    public static void main(String[] args) throws IOException {
        int U = 3;
        int L = 2;
//    int[] c = {2,1,1,0,1};
//    int[] c = {0,0,1,1,2};
        StringBuilder output = new StringBuilder();
        int[] C = {2, 1, 1, 0, 1};
        int[][] result = new int[2][C.length];

        int upper = 0;
        int lower = 0;
        for (int i = 0; i < C.length; i++) {
            if (C[i] == 0) {
                result[0][i] = 0;
                result[1][i] = 0;
            } else if (C[i] == 2) {
                result[0][i] = 1;
                result[1][i] = 1;
                upper++;
                lower++;
            }
        }

        for (int i = 0; i < C.length; i++) {
            if (C[i] == 0 || C[i] == 2) {
                continue;
            }
            if (U == upper) {
                result[1][i] = 1;
                lower++;
            } else {
                result[0][i] = 1;
                upper++;
            }
        }

        for (int i = 0; i < result.length; i++) {
            if (upper != U || lower != L) {
                output.append("IMPOSSIBLE");
                break;
            }
            for (int j = 0; j < result[i].length; j++) {
                output.append(result[i][j]);
            }
            if (i == 0) output.append(",");
        }
        System.out.println(output);
    }
}
