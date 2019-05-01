package programmers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class wijang {
  static int solution(String[][] clothes){
    int answer = 1;
    int cnt = clothes.length;
    Map<String, Integer> map = new HashMap<>();

    for(int i=0; i<cnt; i++){
      if(map.containsKey(clothes[i][1])){
        map.put(clothes[i][1], map.get(clothes[i][1])+1);
      }else{
        map.put(clothes[i][1], 1);
      }
    }

    Iterator<Integer> it = map.values().iterator();

    while(it.hasNext()) {
      System.out.println(it.next());
//      answer *= it.next().intValue()+1;
    }
    return answer-1;
  }

  public static void main(String[] args){
    String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"reen_turban", "headgear"}};
    System.out.println("solution is "+solution(clothes));
    System.out.println("111111");
  }
}
