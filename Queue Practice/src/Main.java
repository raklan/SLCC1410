public class Main{
    public static void main(String[] args) {
        Queue<String> queue = new Queue<String>();

        System.out.println(queue.isEmpty());
        queue.enqueue("Hello World");
        queue.enqueue("Test");
        System.out.println(queue.isEmpty());
        System.out.println(queue.getSize());
        System.out.println(queue.dequeue());
    }
}