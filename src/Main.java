public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.front = q.rear = null;
        Solution.enQueue(q, 14);
        Solution.enQueue(q, 22);
        Solution.enQueue(q, 6);
        Solution.displayQueue(q);

        System.out.println("");
        System.out.printf(" Deleted value = %d", Solution.deQueue(q));
        System.out.println("");
        System.out.printf(" Deleted value = %d", Solution.deQueue(q));
        System.out.println("");
        Solution.displayQueue(q);

        System.out.println("");
        Solution.enQueue(q, 9);
        Solution.enQueue(q, 20);
        Solution.displayQueue(q);
    }
}