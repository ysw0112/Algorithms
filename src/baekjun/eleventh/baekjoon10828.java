package baekjun.eleventh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


public class baekjoon10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int count = Integer.parseInt(br.readLine());

        ArrayList list = new ArrayList();

        for (int i=0; i<count; i++){
            String input = br.readLine();
            String first = input.split(" ")[0];
            if (first.equals("push")){
                int value = Integer.parseInt(input.split(" ")[1]);
                stack.push(value);
            } else if (first.equals("pop")){
                if(stack.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(stack.pop());
                }
            } else if (first.equals("size")){
                System.out.println(stack.size());
            } else if (first.equals("empty")){
                if(stack.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            } else if (first.equals("top")){
                if(stack.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(stack.peek());
                }
            }
        }
    }
}
