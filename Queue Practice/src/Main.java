public class Main{
    public static void main(String[] args) {
        Queue<String> queue = new Queue<String>();

        queue.printIsEmpty();
        queue.enqueue("Hello World");
        queue.enqueue("Test");
        queue.printIsEmpty();
        System.out.println(queue.peek());
        queue.enqueue("This is a String");
        System.out.println(queue.toString());
        queue.enqueue(":)");
        System.out.println("If I were to call dequeue right now it would remove: "+queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.toString());
}
}