

public class ArrayQueue<E> implements Queue<E> {

    E data[];
    int f=0;
    int sz=0;
    static final int CAPCITY=100;

    public ArrayQueue(int c)
    {
        data= (E[])new Object[c];
    }

    public ArrayQueue() {
        this(CAPCITY);
    }
    @Override
    public boolean isEmpty() {

        return sz==0;
    }

    @Override
    public int size() {

        return sz;
    }

    @Override
    public void enqueue(E element) {
        if (size()==data.length)
            throw new IllegalStateException("Queue is full");
        int i= (f+sz)% data.length;
        data[i]=element;
        sz++;

    }

    @Override
    public E dequeue() {
       if (isEmpty())return null;
       E x= data[f];
       data[f]=null;
       sz--;
       f=(f+1)%data.length;
       return x;
    }

    @Override
    public E first() {
        if (isEmpty()) return null;
        return data[f];
    }
}
