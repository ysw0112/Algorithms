package uahan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.InputMismatchException;

//우아한형제들의 주문팀은 팀워크 향상을 위하여 가평으로 워크숍을 가게 됐습니다.
//주문팀 팀원 A는 워크숍에서 팀원들끼리 같이 할 수 있는 게임을 생각하던 중 숫자를 이용한 게임을 떠올리게 됩니다.
//0-20까지의 숫자 중 무작위로 하나가 적힌 종이를 바닥에 여러 장 뿌려놓고 술래가 숫자 하나를 크게 외칩니다.
//술래를 제외한 나머지 팀원들은 바닥에 뿌려진 종이 중 3장을 집어 종이에 적힌 숫자의 합이 술래가 외친 숫자와 같다면 게임에서 승리하게 됩니다.
//
//
//입력조건
//1. 표준입력으로 첫 번째 줄에는 0에서 20까지의 int형 숫자들이 공백으로 구분되어 최대 20개까지 주어집니다.
//2. 최대 20개의 숫자는 중복되어 주어질 수 있고, 정렬되지 않았습니다.
//3. 표준입력으로 두 번째 줄에는 술래가 외친 숫자 하나가 주어집니다.
//
//
//출력조건
//1. 결괏값으로 3개의 숫자는 왼쪽부터 오름차순으로 출력되어야 합니다. 1 3 2가 답이라면 1 2 3으로 출력해야 합니다.
//2. 결괏값으로 3개의 숫자는 아래로 오름차순으로 출력되어야 합니다. 1 2 5, 1 3 4이 결괏값이라면 1 2 5를 먼저 출력해야 합니다.
//3. 결괏값으로 3개 숫자의 조합 중 같은 조합이 여러 개 존재한다면 한 번만 출력해야 합니다. 1 2 3, 1 2 3이 결괏값이라면 1 2 3 한 번만 출력되어야 합니다.
//4. 결괏값이 없다면 NO를 출력합니다

public class first {
    static int totalCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int targetNumber = Integer.valueOf(br.readLine());
        int selectNumber = 3;

        String[] splitInputData = input.split(" ");
        int[] stringToIntArray = Arrays.asList(splitInputData).stream().mapToInt(Integer::parseInt).sorted().distinct().toArray();
        int[] tempArr = new int[stringToIntArray.length];

        if (stringToIntArray.length > 20) throw new InputMismatchException("입력값 초과");

        doCombination(tempArr, stringToIntArray.length, selectNumber, 0, 0, stringToIntArray, targetNumber);
        if (totalCount == 0) {
            System.out.println("NO");
        }
    }

    public static void doCombination(int[] combArr, int n, int r, int index, int target, int[] arr, int targetNumber) {
        if (r == 0) {
            int sum = 0;
            for (int i = 0; i < index; i++) {
                sum += arr[combArr[i]];
            }
            if (sum == targetNumber) {
                System.out.println(arr[combArr[0]] + " " + arr[combArr[1]] + " " + arr[combArr[2]]);
                totalCount++;
            }

        } else if (target == n) return;
        else {
            combArr[index] = target;
            doCombination(combArr, n, r - 1, index + 1, target + 1, arr, targetNumber); // (i)
            doCombination(combArr, n, r, index, target + 1, arr, targetNumber); //(ii)
        }
    }
}
// INPUT
//1 2 3 4 5
//8
// OUTPUT
//1 2 5
//1 3 4

// INPUT
//1 2 3 4 5
//3
// OUTPUT
//NO