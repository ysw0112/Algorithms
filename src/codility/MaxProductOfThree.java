package codility;

import java.util.Arrays;

public class MaxProductOfThree {
    public static int solution(int[] A) {
        Arrays.sort(A);

//        if (A[A.length - 1] < 0) {
//            return A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
//        }
//
//        if (A[A.length - 2] < 0 || A[A.length - 3] < 0) {
//            return A[A.length - 1] * A[0] * A[1];
//        }

        int p1 = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        int p2 = A[A.length - 1] * A[0] * A[1];

        return p1 > p2 ? p1 : p2;
    }

    public static void main(String[] args) {
        int[] arr = {-1, -7, -5, -2, -3};

        System.out.println(solution(arr));
    }
}
