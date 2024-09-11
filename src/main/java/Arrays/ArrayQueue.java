package Arrays;

public class ArrayQueue {
    private int front;
    private int rear;
    private int size;
    private int[] queue;

    // Constructor to initialize the queue with a specific size
    public ArrayQueue(int capacity) {
        this.size = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front > rear;
    }

    // Check if the queue is full
    public boolean isFull() {
        return rear == size - 1;
    }

    // Enqueue operation to add elements to the rear of the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return;
        }
        queue[++rear] = value;
        System.out.println(value + " enqueued to the queue.");
    }

    // Dequeue operation to remove elements from the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Return -1 to indicate the queue is empty
        }
        int dequeuedValue = queue[front++];
        System.out.println(dequeuedValue + " dequeued from the queue.");
        return dequeuedValue;
    }

    // Peek operation to view the front element of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek.");
            return -1;
        }
        return queue[front];
    }

    // Display all the elements in the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display();

        queue.dequeue();
        queue.display();

        System.out.println("Front element: " + queue.peek());
    }
}
