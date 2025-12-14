package org.example.datastructures;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

//Priority queue = A FIFO Data structure that serves elements with the
//Highest priorities first before elements with lower priority
//For numbers, this would be ascending order by default
public class PriorityQueueExample {

    public static void example() {
        //Reverses the order of priority
        //Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
//        queue.offer(3.0);
//        queue.offer(2.5);
//        queue.offer(4.0);
//        queue.offer(1.5);
//        queue.offer(2.0);

        Queue<String> queue = new PriorityQueue<>();

        queue.offer("a");
        queue.offer("c");
        queue.offer("f");
        queue.offer("d");
        queue.offer("b");

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}