package inflearn.chap7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example6 {

    static int[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.valueOf(br.readLine()).intValue();
        check = new int[input+1];
        solution(input);
    }

    private static void solution(int input) {
        DFS(1, input);
    }

    private static void DFS(int i, int input) {
        if (i > input){
            for (int j = 1; j < check.length; j++) {
                if(check[j] > 0){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
        else {
            check[i]=1;
            DFS(i+1, input);
            check[i]=0;
            DFS(i+1, input);
        }
    }
}
