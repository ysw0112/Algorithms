package baekjun.ninth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class baekjoon1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        Set<String> hs = new HashSet<>();

        for (int i = 0; i < cnt; i++) {
            hs.add(br.readLine());
        }

        String[] result = new String[hs.size()];
        hs.toArray(result);

        for (int i = 1; i <= result.length; i++) {
            for (int j = 0; j < result.length - i; j++) {
                if (result[j].length() > result[j + 1].length()) {
                    String temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            int max = -1;
            for (int j = i; j < result.length; j++) {
                if (result[i].length() == result[j].length()) {
                    max = j;
                }
            }
            Arrays.sort(result, i, max + 1);
            i = max;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
