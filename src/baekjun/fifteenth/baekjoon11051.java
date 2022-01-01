package baekjun.fifteenth;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baekjoon11051 {
    static int[][] list;

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int r = sc.nextInt();
//        list = new int[1001][1001];
//        list[1][0] = list[1][1] = 1;
//
//        for (int i = 2; i <= n; i++) {
//            for (int j = 0; j <= i; j++) {
//                if (i == j || j == 0)
//                    list[i][j] = 1;
//                else
//                    list[i][j] = list[i - 1][j - 1] + list[i - 1][j];
//
//                list[i][j] %= 10007;
//            }
//        }
//        System.out.println(list[n][r]);
        List<String> a = new ArrayList<>();

        a.add("인경특가");
        a.add("특가");
        a.add("[특가 추천]");
        a.add("투데이특가");
        a.add("위메프데이");
        a.add("반값데이");
        a.add("브랜드데이");
        a.add("신상데이");
        a.add("프라이스");

        System.out.println("할인 슈퍼블랙프라이스".endsWith("할인"));

    }
}
