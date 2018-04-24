public class Queue<E> {
    private java.util.ArrayList<E> queue;
    public Queue(){
        queue = new java.util.ArrayList<E>();
    }

    public void enqueue(E o){
        queue.add(o);
    }

    public E dequeue(){
        E toReturn = (queue.get(0));
        queue.remove(queue.get(0));
        return toReturn;
    }

    public int getSize(){
        return queue.size();
    }

    public E peek(){
        return queue.get(0);
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }
}