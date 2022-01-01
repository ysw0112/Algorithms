package uahan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

//2018년 8월 1일 새롭게 상거래사이트를 오픈한 A 씨는 오늘까지(2018년 8월 10일) 자신의 사이트에서 일어난 주문 목록을 '판매일|상품번호|지역코드'의 형태로 예시와 같이 출력해 보았습니다.
//
//A 씨는 사이트 오픈일인 2018년 8월 1일과 아직 마감이 이루어지지 않은 오늘 2018년 8월 10일 제외하고 2018년 8월 2일부터 2018년 8월 9일까지(2일,9일 포함) 주문 목록을 기준으로 많이 판매된 상품과 그 상품이 어느 지역에서 판매가 되었는지 상위 3개의 데이터가 궁금해졌습니다.
//
//A 씨가 출력하고 싶은 형태의 데이터는 보기와 같습니다. 예시 데이터를 이용하여 보기와 같은 형태로 출력하십시오.
//
//보기)
//상품번호:판매횟수=>지역코드:판매횟수,지역코드:판매횟수,지역코드:판매횟수
//상품번호:판매횟수=>지역코드:판매횟수,지역코드:판매횟수,지역코드:판매횟수
//상품번호:판매횟수=>지역코드:판매횟수,지역코드:판매횟수,지역코드:판매횟수
//
//2018-08-03|10001|A02
//공통)
//- JAVA 8 기준으로 작성합니다.( 컬렉션,람다 사용 )
//- 많이 판매된 상품을 기준으로 최대 3개까지 정렬됩니다.
//- 상품의 판매횟수가 같을 경우 상품번호로 순차 정렬됩니다.
//- 상품별 판매지역의 경우 판매횟수가 많은 순으로 왼쪽에서 오른쪽으로 최대 3개까지 정렬됩니다.
//- 판매지역의 판매횟수가 같을 경우 지역 코드로 순차 정렬됩니다.
//- 관련 데이터가 없는 경우 결과는 'NO RESULT' 입니다.

class InputItem {

    private String date;
    private int pNumber;
    private String code;

    InputItem(String date, int pNumber, String code) {
        this.date = date;
        this.pNumber = pNumber;
        this.code = code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setpNumber(int pNumber) {
        this.pNumber = pNumber;
    }

    public int getpNumber() {
        return pNumber;
    }

    @Override
    public String toString() {
        return this.getDate() + "|" + this.getpNumber() + "|" + this.getCode();
    }
}

public class second {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        List<InputItem> lineList = new ArrayList();
        while ((line = br.readLine()) != null && !"".equals(line)) {
            String[] inputLine = line.split("\\|");
            lineList.add(new InputItem(inputLine[0], Integer.valueOf(inputLine[1]), inputLine[2]));
        }

        lineList.stream().filter(value -> value.getDate().matches("^2018-08-0[2-9]"))
                .collect(Collectors.groupingBy(item -> item.getpNumber()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue((a, b) -> b.size() - a.size()))
                .forEach(v -> {
                    StringBuilder sb = new StringBuilder();
                    sb.append(v.getKey() + ":" + v.getValue().size() + "=>");
                    v.getValue().stream().collect(Collectors.groupingBy(InputItem::getCode, Collectors.counting()))
                            .entrySet()
                            .stream()
                            .sorted(Map.Entry.comparingByValue((a, b) -> (int) (b - a)))
                            .forEach(v1 -> {
                                sb.append(v1.getKey() + ":" + v1.getValue() + ",");
                            });
                    System.out.println(sb.delete(sb.length() - 1, sb.length()));
                });
    }
}
// INPUT
//2018-08-03|10001|A02
//2018-08-01|10004|A09
//2018-08-02|10001|A02
//2018-08-05|10001|A05
//2018-08-09|10001|A07
//2018-08-10|10007|A09
//2018-08-08|10001|A05
//2018-08-08|10001|A02
//2018-08-04|10003|A01
//2018-08-02|10003|A04
//2018-08-04|10003|A01
//2018-08-04|10003|A06
//2018-08-03|10006|A01
//2018-08-02|10006|A02
//2018-08-03|10006|A04
//2018-08-10|10007|A09
// OUTPUT
//10001:6=>A02:3,A05:2,A07:1
//10003:4=>A01:2,A04:1,A06:1
//10006:3=>A01:1,A02:1,A04:1


