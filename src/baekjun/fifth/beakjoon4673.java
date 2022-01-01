package baekjun.fifth;

public class beakjoon4673 {
    public static void main(String[] args) {
        boolean[] checkArr = new boolean[10000];

        for (int i = 1; i < 10001; i++) {
            int result = solution(i);

            if (result < 10000) {
                checkArr[result] = true;
            }
        }

        for (int i = 1; i < checkArr.length; i++) {
            if (checkArr[i] == false) {
                System.out.println(i);
            }
        }
    }

    public static int solution(int n) {
        int one = 0;
        int ten = 0;
        int hundred = 0;
        int thousand = 0;
        int tenThousand = 0;
        tenThousand = n / 10000;
        thousand = n % 10000 / 1000;
        hundred = n % 10000 % 1000 / 100;
        ten = n % 10000 % 1000 % 100 / 10;
        one = n % 10000 % 1000 % 100 % 10;

        int result = n + tenThousand + thousand + hundred + ten + one;
        return result;
    }
}
