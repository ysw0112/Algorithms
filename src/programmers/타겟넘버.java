package programmers;

public class 타겟넘버 {
    static int ANSWER = 0;

    public static int solution(int[] numbers, int target) {
        dfs(target, numbers, 0);
        return ANSWER;
    }

    public static void dfs(int target, int[] numbers, int k) {
        if (k == numbers.length) {
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            if (sum == target)
                ANSWER++;
            return;
        } else {
            numbers[k] *= 1;
            dfs(target, numbers, k + 1);

            numbers[k] *= -1;
            dfs(target, numbers, k + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1};
        int targetNumber = 3;
        solution(arr, targetNumber);
        System.out.println(ANSWER);
    }

}
