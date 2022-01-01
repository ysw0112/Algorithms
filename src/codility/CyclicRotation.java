package codility;

public class CyclicRotation {
    public int[] solution(int[] a, int k) {

        int[] result = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            result[(i + k) % a.length] = a[i];
        }
        return result;
    }

    public static void main(String[] args) {
        CyclicRotation c = new CyclicRotation();
        int[] arr = {3, 8, 9, 7, 6};
        c.solution(arr, 3);

    }
}
