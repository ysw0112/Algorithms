package javaStudy;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import jdk.nashorn.internal.objects.annotations.Getter;


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
        Test test = new Test(6, 1,"A");
        Test test1 = new Test(3, 1,"B");
        Test test2 = new Test(2, 2,"C");
        Test test3 = new Test(5, 2,"D");

        List<Test> list = new ArrayList<>();
        list.add(test);
        list.add(test1);
        list.add(test2);
        list.add(test3);

        Map<Long, List<Test>> collect = list.stream().collect(Collectors.groupingBy(Test::getCtlgSeq));
        System.out.println(collect);
    }
}
