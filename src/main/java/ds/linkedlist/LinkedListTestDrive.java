package ds.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListTestDrive {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("d");
//        list.add("e");
//        list.pop();

        list.offer("a");
        list.offer("b");
        list.offer("c");
        list.offer("d");
        list.offer("f");
        //list.poll();
        list.add(4, "e");
        list.addFirst("0");
        list.addLast("g");
        list.removeFirst();

        for (String s : list) {
            System.out.println(s);
        }
    }
}
