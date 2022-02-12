package javaStudy;


import java.util.HashMap;
import java.util.Map;


public class Test {
    private long salesCnt;
    private long ctlgSeq;
    private String period;


    public Test(long salesCnt, long ctlgSeq, String period) {
        this.salesCnt = salesCnt;
        this.ctlgSeq = ctlgSeq;
        this.period = period;
    }

    public long getCtlgSeq() {
        return ctlgSeq;
    }

    public long getSalesCnt() {
        return salesCnt;
    }
    public String getPeriod() {
        return period;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> test = new HashMap<>();
        test.put(1,1);
        test.put(2,2);
        test.put(3,3);
        test.put(4,4);
        test.put(5,5);
        test.put(6,6);
        test.put(7,7);
        test.put(8,8);
        test.put(9,9);
        test.put(10,10);
        test.forEach((element,e2) -> {
            System.out.println(e2);
            test.get(9);
        });
    }
}
