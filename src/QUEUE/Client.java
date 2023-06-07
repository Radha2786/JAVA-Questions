package QUEUE;

public class Client {
    public static void main(String[] args) throws Exception {
        MeraQueue queue = new MeraQueue();
        queue.enqueue(10);
        System.out.println(queue.size);
        queue.enqueue(20);
        System.out.println(queue.size);
        queue.enqueue(30);
        System.out.println(queue.size);
        queue.enqueue(40);
        System.out.println(queue.size);
        queue.enqueue(50);
        System.out.println(queue.size);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println(queue.dequeue());

        System.out.println(queue.dequeue());

        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());

    }
}
