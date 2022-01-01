package kakao;

public class kakaoFoodTime {
    public static int solution(int[] food_times, long k) {
        int answer = 0;
        int rotation = food_times.length;

//        while (true){
//
//        }
        int cnt = 0;
        for (long i = 0; i < k; i++) {
            if (food_times[cnt] == 0) {
                if (cnt == rotation - 1) cnt = 0;
                food_times[cnt] = food_times[cnt] - 1;
            }
            if (cnt == rotation - 1) cnt = 0;
            food_times[cnt] = food_times[cnt] - 1;
            cnt++;
            System.out.println(food_times[0] + "==" + food_times[1] + "==" + food_times[2]);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] a = {3, 1, 2};
        solution(a, 5);
    }
}
