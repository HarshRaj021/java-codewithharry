package ch15_collectionFramework;

import java.util.LinkedList;

public class LinkedList96 {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.addFirst(5);
        list.addLast(40);

        System.out.println("List = " + list);

        System.out.println("First = " + list.getFirst());
        System.out.println("Last = " + list.getLast());

        list.removeFirst();
        list.removeLast();

        System.out.println("After removal = " + list);
    }
}