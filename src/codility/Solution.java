package codility;

import java.lang.*;
import java.util.Arrays;

class Solution {
    public int solution(int N) {
        int N3 = 1;
        String bina = Integer.toBinaryString(N);
        String pro[] = bina.split("0");

        int[] score = new int[pro.length];
        N = 0;
        System.out.println(pro.length);
        for (int i = 0; i < pro.length; i++) {
//            System.out.println(pro[i].length());
            if (pro[i].length() == 0) {
                N3++;
            } else {
                N3 = 1;
            }

            score[0] = N3;
            Arrays.sort(score);
            N = score[score.length - 1];
            System.out.println(N);
        }
        return N;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int a = s.solution(32);
        System.out.println(a);
    }
}