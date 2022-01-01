package uahan;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class test4 {
    static int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        Arrays.sort(A);
        Arrays.sort(B);
        List<Integer> convertBToList = Arrays.stream(B).boxed().collect(Collectors.toList());
        int i = 0;
        for (int k = 0; k < n; k++) {
            if (i < m - 1 && B[i] < A[k]) {
                int s = Arrays.stream(B).boxed().collect(Collectors.toList()).indexOf(A[k]);
                System.out.println(s);
            }
            if (A[k] == B[i])
                return A[k];
        }
        return -1;
    }

    public static void main(String[] args) {
//    int[] A ={1, 3, 2, 1};
//    int[] B ={4, 2, 5, 3, 2};
        int[] B = {1, 4, 2, 6, 4, 3};
        int[] A = {4, 15};
        int result = solution(A, B);
        System.out.println(result);
    }
}
