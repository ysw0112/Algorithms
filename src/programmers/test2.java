package programmers;

public class test2 {

    public static void main(String[] args) {
        test2 test2 = new test2();
        int[] solution = test2.solution(new int[]{0, 0, 0,1,0});
        for (int i = 0; i < solution.length; i++) {
            System.out.print(solution[i] + " ");
        }
    }

    public int[] solution(int[] black_caps) {
        int[] answer = new int[black_caps.length];
        for (int i = 0; i < black_caps.length; i++) {
            int black_cap = black_caps[i];
            if (i == 0) {
                if (black_cap == 1) {
                    answer[i + 1] = 1;
                } else if (black_cap == 0) {
                    answer[i + 1] = 2;
                }
            } else if (i == black_caps.length - 1) {
                if (black_cap == 1) {
                    answer[i - 1] = 1;
                } else if (black_cap == 0) {
                    answer[i - 1] = 2;
                }
            } else {
                if (black_cap == 2) {
                    answer[i + 1] = 1;
                    answer[i - 1] = 1;
                } else if (black_cap == 1) {
                    if (answer[i - 1] == 0 && answer[i + 1] == 1) {
                        answer[i - 1] = 2;
                    } else if (answer[i - 1] == 1 && answer[i + 1] == 0) {
                        answer[i + 1] = 2;
                    } else if (black_caps[i + 1] + black_caps[i - 1] > 2) {
                        answer[i - 1] = 1;
                    } else if (answer[i - 1] == 2) {
                        answer[i + 1] = 1;
                    }
                } else if (black_cap == 0){
                    answer[i + 1] = 2;
                    answer[i - 1] = 2;
                }
            }
        }
        return answer;
    }
}
