package codility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringCombination {

    private static String[] charData;
    private static char[] words;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        words = new char[arr.length];
        charData = new String[arr.length];
        genWord(arr.length, 0, getRemainChar(arr, -1));
    }

    private static void genWord(int n, int depth, char[] remainWords) {
        for (int i = 0; i < n; i++) {
            words[depth] = remainWords[i];
            if (remainWords.length == 1) {
                for (int j = 0; j < charData.length; j++) {
                    System.out.print(words[j]);
                }
                System.out.println();
            }
            genWord(n - 1, depth + 1, getRemainChar(remainWords, i));
        }
    }

    private static char[] getRemainChar(char[] source, int removeIdx) {
        if (removeIdx == -1) {
            return source;
        }
        char[] result = new char[source.length - 1];
        int index = 0;
        for (int i = 0; i < source.length; i++) {
            if (i != removeIdx) {
                result[index] = source[i];
                index++;
            }
        }
        return result;
    }
}