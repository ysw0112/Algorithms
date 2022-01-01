package baekjun.second;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class beakjoon2558 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        List<Integer> resultList = new ArrayList<>();

        while (c.hasNextInt()) {
            int input = c.nextInt();
            c.nextLine();
            resultList.add(input);
            if (resultList.size() == 2) {
                break;
            }

        }
        c.close();

        System.out.println(resultList.get(0) + resultList.get(1));
    }
}
