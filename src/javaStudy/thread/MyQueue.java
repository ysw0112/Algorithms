package javaStudy.thread;

import java.util.NoSuchElementException;

public class MyQueue {

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enque("1");
        queue.enque("2");
        queue.enque("3");
        queue.enque("4");
        queue.enque("5");

        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println(queue.deque());

        System.out.println(queue.size);
    }

    private int size;
    private Node head, tail;

    private class Node {
        private String value;
        private Node next;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void enque(String item) {
        Node oldTail = tail;
        tail = new Node();
        tail.value = item;
        tail.next = null;
        if (isEmpty()) {
            head = tail;
        } else {
            oldTail.next = tail;
        }
        size++;
    }
    public String deque() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        String value = head.value;
        head = head.next;
        System.out.println(head.value+"@@@@");
        size--;
        if (isEmpty()) {
            tail = null;
        }
        return value;
    }
}
