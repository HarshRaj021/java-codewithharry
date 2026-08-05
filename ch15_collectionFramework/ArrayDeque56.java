package ch15_collectionFramework;

import java.util.ArrayDeque;

public class ArrayDeque56 {

    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(20);
        deque.addFirst(10);

        deque.addLast(30);
        deque.addLast(40);

        System.out.println(deque);

        System.out.println("First = " + deque.getFirst());
        System.out.println("Last = " + deque.getLast());

        deque.removeFirst();
        deque.removeLast();

        System.out.println(deque);
    }
}