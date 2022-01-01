package codility;

public class PermMissingElem {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        int originArrSum = 0;
        int fullArrSum = 0;
        int result = 0;

        for (int i = 0; i < A.length; i++) {
            originArrSum += A[i];
        }
        for (int i = 1; i <= A.length + 1; i++) {
            fullArrSum += i;
        }
        result = fullArrSum - originArrSum;
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 5};
        System.out.println(solution(arr));
    }
}
