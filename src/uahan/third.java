package uahan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//서울 잠실의 배민은행에 3인조 은행강도가 들어서 100억 원 상당의 현금을 강탈했습니다.
//경찰은 용의자들의 집을 급습하여 여러 장의 메모들을 증거로 확보했는데요.
//강도 3명의 메모가 제각각이라 날짜 순서대로 메모들을 정렬해서 보려고 합니다.
//다음의 메모들을 날짜순으로 정렬해주세요.
//
//
//입력조건
//1. 표준입력으로 메모 한 장의 내용이 한 줄로 주어집니다.
//2. 메모 내용 중 날짜는 2018/7/8, 2018-7-8, 2018년7월8일의 형태로 주어집니다.
//3. 년도에 2자리 숫자만 온다면 20XX년으로 가정합니다. 월과 일이 1~9 범위의 숫자인 경우 0 이 있을 수도 있고 없을 수도 있습니다.
//4. 모든 메모에는 날짜가 반드시 1번만 포함됩니다.
//5. 입력의 마지막으로 END가 주어집니다.
//
//
//출력조건
//1. 날짜 오름차순으로 메모 내용을 한 줄씩 출력합니다. ( 2018년 메모와 2019년 메모가 있다면 2018년 메모를 먼저 출력합니다. )
//2. 출력되는 메모의 내용은 입력받은 메모 내용 그대로 출력해야 합니다.

public class third {
    public static void main(String[] args) throws IOException {
        Pattern p = Pattern.compile("\\d+.\\d+.\\d+");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        int cnt = 0;

        Map<Integer, String> inputMap = new HashMap<>();
        Map<Integer, Integer> tempMap = new HashMap<>();

        while ((line = br.readLine()) != null && !"END".equals(line)) {
            inputMap.put(cnt++, line);
        }

        cnt = 0;
        for (String value : inputMap.values()) {
            Matcher infoMatcher = p.matcher(value);
            if (infoMatcher.find()) {
                StringBuilder sb = new StringBuilder();
                String date = infoMatcher.group();
                if (infoMatcher.group().substring(0, 4).matches("20\\d+")) {
                    sb.append(date);
                } else {
                    sb.append("20").append(date);
                }

                if (sb.toString().substring(5, 7).matches("[\\d][^\\d]")) {
                    sb.insert(5, "0");
                }

                if (sb.toString().length() == 9) {
                    sb.insert(8, "0");
                }
                tempMap.put(Integer.valueOf(sb.delete(4, 5).delete(6, 7).toString()), cnt++);
            }
        }

        TreeMap<Integer, Integer> sorted = new TreeMap<>(tempMap);
        for (Integer a : sorted.values()) {
            System.out.println(inputMap.get(a));
        }
    }
}

// INPUT
//"2018/7/3 배민은행의 구조도를 손에 넣었다. 필요한 장비는 이런거 저런거 해서 각자 준비해야한다."
//"타깃 은행은 잠실에 있는 배민은행으로 한다. 18년06월13일"
//"배민은행앞 별다방에서 18-06-12에 만나기로 함"
//END
// OUTPUT
//"배민은행앞 별다방에서 18-06-12에 만나기로 함"
//"타깃 은행은 잠실에 있는 배민은행으로 한다. 18년06월13일"
//"2018/7/3 배민은행의 구조도를 손에 넣었다. 필요한 장비는 이런거 저런거 해서 각자 준비해야한다."



