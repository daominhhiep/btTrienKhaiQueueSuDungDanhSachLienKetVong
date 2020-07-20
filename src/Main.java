public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.front = queue.rear = null;
        Solution.enQueue(queue, 14);
        Solution.enQueue(queue, 22);
        Solution.enQueue(queue, 6);
        Solution.displayQueue(queue);

        System.out.println("");
        System.out.printf(" Deleted value = %d", Solution.deQueue(queue));
        System.out.println("");
        System.out.printf(" Deleted value = %d", Solution.deQueue(queue));
        System.out.println("");
        Solution.displayQueue(queue);

        System.out.println("");
        Solution.enQueue(queue, 9);
        Solution.enQueue(queue, 20);
        Solution.displayQueue(queue);
    }
}