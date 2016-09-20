package ImplementingQueueUsingGenerics;

/**
 * Created by PS049141 on 9/19/2016.
 */
public class QueueFullException extends Exception {
    int size;
    QueueFullException(int s)
    {
        size = s;
    }
    public String toString()
    {
       return "Queue is full" + size;
    }
}
