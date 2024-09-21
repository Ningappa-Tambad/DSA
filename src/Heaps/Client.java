package Heaps;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Client {

    public static void main(String[] args) {

        PriorityQueue<Integer> minheap = new PriorityQueue<>(Collections.reverseOrder());

        minheap.add(10);
        minheap.add(20);
        minheap.add(2);
        minheap.add(40);
        minheap.add(50);

        System.out.println(minheap.peek());


        System.out.println(minheap);

    }



}



