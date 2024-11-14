package ds.queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTestDrive {
    public static void main(String[] args) {
        //Queue<String> queue = new LinkedList<>();
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
