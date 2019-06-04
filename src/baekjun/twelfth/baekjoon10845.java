package baekjun.twelfth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class baekjoon10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        Queue<String> q = new LinkedList();

        for(int i=0; i<cnt; i++){
            String input[] = br.readLine().split(" ");
            String temp = "";
            switch (input[0]){
                case "push":
                    q.add(input[1]);
                    break;
                case "pop":
                    if(q.isEmpty()){
                        System.out.println(-1);
                    }else{
                        temp = ((LinkedList<String>) q).pop();
                        System.out.println(temp);
                    }
                    break;
                case "size":
                    System.out.println(q.size());
                    break;
                case "empty":
                    if(q.isEmpty()){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                    break;
                case "front":
                    if(q.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(q.peek());
                    }
                    break;
                case "back":
                    if(q.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(((LinkedList<String>) q).getLast());
                    }
                    break;
            }
        }

    }
}
