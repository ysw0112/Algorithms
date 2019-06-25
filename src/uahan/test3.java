package uahan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

public class test3 {
  public static void main(String[] args) {
    int[] A = {3,2,-3,5,-2};
    List<Integer> result = new ArrayList<>();

    for(int i=0; i<A.length; i++){
      if(A[i] < 0){
        for (int j=0; j<A.length; j++){
          if (A[j] == Math.abs(A[i])){
            System.out.println(A[j]);
            result.add(A[j]);
          }
        }
      }
    }
    Collections.sort(result);
    if (result.size() == 0){
      System.out.println("0");
    }else{
      System.out.println(result.get(result.size()-1));
    }
  }
}
