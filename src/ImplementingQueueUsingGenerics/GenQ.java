package ImplementingQueueUsingGenerics;

/**
 * Created by PS049141 on 9/19/2016.
 */
public class GenQ<T> implements IGwnQ<T> {
    private T q[];
    private int dequeueLoc;
    private int enqueueLoc;

    //constructor to construct an empty array

    GenQ(T[] aRef)
    {
       q = aRef;
        dequeueLoc = 0;
        enqueueLoc =0;
    }

    @Override
    public void enqueue(T obj) throws QueueFullException{
        if(dequeueLoc == q.length)
            throw new QueueFullException(q.length);

        q[dequeueLoc++] = obj;

    }

    @Override
    public T dequeue()throws QueueEmptyException {
        if(enqueueLoc == dequeueLoc)throw new QueueEmptyException();
        return q[enqueueLoc++];
    }
}
