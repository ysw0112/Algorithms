package inflearn.chap5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

/*
인형뽑기(카카오)
자연수 N이 주어지면 N*N 만큼의 board 배열에 1~100 인형을 의미하는 숫자들이 들어있다. 0은 빈 칸
board 격자판은 1*1부터 시작한다.
M은 moves의 배열의 길이를 나타낸다
첫 줄에 터트려져 사라진 인형의 개수를 출력
입력
5
0 0 0 0 0
0 0 1 0 3
0 2 5 0 1
4 2 4 4 2
3 5 1 3 1
8
1 5 3 5 1 2 1 4
출력
4
 */
public class Example3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine())+1;
        int [][] board = new int[n][n];
        for (int i = 1; i < n; i++) {
            int[] s = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int k = 0;
            for (int j = 1; j < n; j++) {
                board[i][j] = s[k++];
            }
        }

        int m = Integer.parseInt(br.readLine());
        int[] moves = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        solution(board, moves);
    }

    private static void solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> bucket = new Stack<>();

        for (int i = 0; i < moves.length; i++) {
            int move = moves[i];
            int yPoint = 1;
            while (yPoint < board.length){
                int dolls = board[yPoint][move];
                if(dolls != 0){
                    board[yPoint][move] = 0;
                    if(!bucket.isEmpty() && bucket.peek() == dolls){
                        bucket.pop();
                        answer = answer + 2;
                    }else {
                        bucket.push(dolls);
                    }
                    break;
                }
                yPoint++;
            }
        }
        System.out.println(answer);
    }

}
