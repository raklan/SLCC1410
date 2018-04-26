public class GenericStack<E> {
    private java.util.ArrayList<E> elements;
    public GenericStack(){
        elements = new java.util.ArrayList<E>();
    }

    public int getSize(){
        return elements.size();
    }

    public E peek(){
        return elements.get(elements.size()-1);
    }

    public E pop(){
        E temp = elements.get(elements.size()-1);
        elements.remove(elements.get(elements.size()-1));
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

    public void printIsEmpty(){
        if(elements.size()==0)
            System.out.println("The Stack IS empty");
        else
            System.out.println("The Stack IS NOT empty");
    }

    public String toString(){
        String contents = "";
        for(E s: elements){
            contents += s.toString()+", ";
        }
        return contents;
    }
}