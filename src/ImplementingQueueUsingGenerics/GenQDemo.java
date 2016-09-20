package ImplementingQueueUsingGenerics;

import UnderstandingGenerics.Gen;

/**
 * Created by PS049141 on 9/19/2016.
 */
public class GenQDemo {
    public static void main(String[] args) {
        Integer[] num = new Integer[10];
        GenQ<Integer> q = new GenQ<>(num);

        int val;
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Adding elements to queue" + i);
                q.enqueue(i);
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }

        System.out.println(" ");
        try{
            for(int i =0;i<5;i++)
                System.out.println("removing elements from the queue"+i);
            val = q.dequeue();
            System.out.println(val);
        }catch(QueueEmptyException ed)
        {
            System.out.println(ed);
        }
    }
}
