package org.example.datastructures;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Queue = FIFO data structure. First-In First-Out (ex. A line of people)
 *   A collection designed for holding elements prior to processing
 *   Linear data structure
 *   Implements collection interface, so has access to things like size/isEmpty/contains
 *
 * Adding to a queue = enqueue = offer()
 * Remove from a queue = dequeue = poll()
 * Examine and return (NOT REMOVE) from a queue = peek()
 *
 * Where are queues useful?
 * 1. Keyboard buffer (letters should appear on the screen in the order they're pressed
 * 2. Printer queue (printer jobs should be completed in order)
 * 3. Used in LinkedLists, PriorityQueues, Breadth-first search (BFS)
 * */
public class QueueExample {

    public static void example() {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        queue.poll();
        queue.poll();
        queue.poll();

        System.out.println(queue);
    }
}