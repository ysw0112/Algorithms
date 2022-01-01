package codility;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class OddOccurrencesInArray {
    public static int solution(int[] A) {
        int result = 0;

        for (int i = 0; i < A.length; i++) {
            result = result ^ A[i];
            System.out.println(result);
        }
        return result;
    }

    public static void main(String[] args) {
//        int[] arr = {5,9,3,9,3,9,9};
//        solution(arr);
        int[] A = {5, 9, 3, 9, 3, 9, 9};
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(3);

        for (Iterator i = set.iterator(); i.hasNext(); ) {
            System.out.println(set.contains(i));
        }
//        for(int i : A){
//            System.out.println(i);
//            set.add(i);
//        }
//        System.out.println(set.iterator().next());
    }
}