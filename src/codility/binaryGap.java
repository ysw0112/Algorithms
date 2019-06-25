package codility;

import java.util.Arrays;

public class binaryGap{

    public int solution(int n){
        String bina = Integer.toBinaryString(n);
        System.out.println(bina);
        String pro[] = bina.split("0");
        int zeroCnt = 1;
        int N = 0;
        int[] result = new int[pro.length];
        System.out.println("length : "+pro.length);
        for(int i=0; i < pro.length; i++) {
            System.out.println(pro[i]);
            if(pro[i].length() == 0){
                zeroCnt++;
            }else{
                zeroCnt=1;
            }
            result[i] = zeroCnt;
        }
        Arrays.sort(result);
        N = result[pro.length-1];
        System.out.println(result[pro.length-1]);
        System.out.println("======================================");
        return N;
    }

    public static void main(String[] args){
        binaryGap b = new binaryGap();
        int a = b.solution(529);
        System.out.println(a);
//        b.solution(17);
    }
}
