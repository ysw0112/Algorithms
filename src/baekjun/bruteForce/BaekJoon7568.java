package baekjun.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BaekJoon7568 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.valueOf(br.readLine()).intValue();

        List<Integer> result = new ArrayList<>();
        List<People> peopleList = new ArrayList<>();
        for (int i=0; i<count; i++){
            String[] value = br.readLine().split(" ");
            int weight = Integer.valueOf(value[0]).intValue();
            int height = Integer.valueOf(value[1]).intValue();
            peopleList.add(new People(weight, height));
        }

        for (int i=0; i<count; i++){
            People targetPeople = peopleList.get(i);
            int compare = 0;
            for (int j=0; j<count; j++){
                if(j==i) continue;
                People people = peopleList.get(j);
                compare = targetPeople.compareTo(people) + compare;
            }
            result.add(i, compare);
        }
        System.out.println(result);
    }

    public static class People implements Comparable<People>{

        private int weight;
        private int height;

        public People(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }

        @Override
        public int compareTo(People o) {
            if(this.weight < o.weight && this.height < o.height){
                return 1;
            }
            return 0;
        }
    }
}
