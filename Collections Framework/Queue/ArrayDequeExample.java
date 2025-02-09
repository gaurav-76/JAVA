import java.util.Queue;
import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        
        // We can use deque as stack

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.offer(1);
        deque.offerFirst(2); // add element at first
        deque.offerLast(3); // add element in last

        System.out.println(deque);

        System.out.println("Peek");
        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        System.out.println(deque.poll());  // pop first element
        System.out.println(deque.pollFirst()); // pop first element
        System.out.println(deque.pollLast()); // pop last element

    }
}
