package ImplementingQueueUsingGenerics;

/**
 * Created by PS049141 on 9/19/2016.
 */
public interface IGwnQ<T> {
    //putting an Item in queue
     public void enqueue(T ch) throws QueueFullException;
    //getting the elements of the queue
    T dequeue() throws QueueEmptyException;



}
