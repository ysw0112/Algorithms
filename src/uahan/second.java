package uahan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

class InputItem {

  private String date;
  private int pNumber;
  private String code;

  InputItem(String date, int pNumber, String code){
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
    while ((line = br.readLine()) != null && !"".equals(line)){
      String[] inputLine = line.split("\\|");
      lineList.add(new InputItem(inputLine[0],Integer.valueOf(inputLine[1]),inputLine[2]));
    }

    lineList.stream().filter(value -> value.getDate().matches("^2018-08-0[2-9]"))
            .collect(Collectors.groupingBy(item -> item.getpNumber()))
            .entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue((a,b) -> b.size() - a.size()))
            .forEach(v -> {
              StringBuilder sb = new StringBuilder();
              sb.append(v.getKey()+":"+v.getValue().size()+"=>");
              v.getValue().stream().collect(Collectors.groupingBy(InputItem::getCode, Collectors.counting()))
                      .entrySet()
                      .stream()
                      .sorted(Map.Entry.comparingByValue((a,b) -> (int) (b-a)))
                      .forEach(v1 -> {
                        sb.append(v1.getKey()+":"+v1.getValue()+",");
                      });
              System.out.println(sb.delete(sb.length()-1, sb.length()));
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


