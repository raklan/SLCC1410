public class GenericStack<E> {
    private java.util.ArrayList<E> elements;
    public GenericStack(){
        elements = new java.util.ArrayList<E>();
    }

    public int getSize(){
        return elements.size();
    }
    public E peek(){
        return elements.get(elements.size());
    }
    public E pop(){
        E temp = elements.get(elements.size());
        elements.remove(elements.get(elements.size()));
        return temp;
    }
    public void push(E o){
        elements.add(o);
    }
    public boolean isEmpty(){
        if(elements.size()==0)
            return true;
        else
            return false;
    }
}