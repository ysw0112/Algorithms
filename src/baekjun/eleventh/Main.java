package baekjun.eleventh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Test stack = new Test();
        stack.push(1);
        stack.push(2);
        System.out.println(stack);
    }
}
class Test {
    private int size = 0;
    private SNode top = null;

    public void push(int x) {
        SNode node = new SNode();
        node.data = x;
        node.next = top;
        System.out.println(node.toString());
        top = node;
        size++;
    }
    private class SNode {
        int data;
        private SNode next;
    }

    public void top() {
        if (top == null){
            System.out.println(-1);
        } else {
            System.out.println(top.data);
        }
    }
    public void empty() {
        if (size == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    public void size() {
        System.out.println(size);
    }
    public void pop() {
        if (size == 0) {
            System.out.println(-1);
        } else {
            System.out.println(top.data);
            top = top.next;
            size--;
        }
    }
}


