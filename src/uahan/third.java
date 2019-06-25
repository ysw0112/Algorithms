package uahan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class third {
  public static void main(String[] args) throws IOException {
    Pattern p = Pattern.compile("\\d+.\\d+.\\d+");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = null;
    int cnt = 0;

    Map<Integer, String> inputMap = new HashMap<>();
    Map<Integer, Integer> tempMap = new HashMap<>();

    while ((line = br.readLine()) != null && !"END".equals(line)){
      inputMap.put(cnt++,line);
    }

    cnt = 0;
    for (String value : inputMap.values()){
      Matcher infoMatcher = p.matcher(value);
      if (infoMatcher.find()){
        StringBuilder sb = new StringBuilder();
        String date = infoMatcher.group();
        if(infoMatcher.group().substring(0,4).matches("20\\d+")){
          sb.append(date);
        }else{
          sb.append("20").append(date);
        }

        if (sb.toString().substring(5, 7).matches("[\\d][^\\d]")){
          sb.insert(5,"0");
        }

        if(sb.toString().length() == 9){
          sb.insert(8,"0");
        }
        tempMap.put(Integer.valueOf(sb.delete(4,5).delete(6,7).toString()), cnt++);
      }
    }

    TreeMap<Integer, Integer> sorted = new TreeMap<>(tempMap);
    for (Integer a : sorted.values()){
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

