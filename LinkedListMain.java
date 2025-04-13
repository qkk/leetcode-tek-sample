package com.sample.tek;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Question 3: Implement a Queue Using Linked Lists
 * Write a class to implement a queue using linked lists with methods for enqueue, dequeue, and peek.
 */
public class LinkedListMain {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        //enqueue
        queue.offer(1); //equals 'add'
        queue.offer(2);
        queue.offer(3);

        // show item : peek
        System.out.println("Top Item:" + queue.peek()); // 1

        // dequeue
        System.out.println("dequeue: " + queue.poll()); //remove 1
        System.out.println("dequeue:" + queue.poll()); //remove 2

        // show top item
        System.out.println("New Top: " + queue.peek()); // output: 3
    }

}
