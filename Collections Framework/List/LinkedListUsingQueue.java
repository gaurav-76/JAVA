import java.util.Queue;
import java.util.LinkedList;

public class LinkedListUsingQueue {
    public static void main(String[] args) {
        
        Queue<Integer> linkedList = new LinkedList<>();
        
        // Push in linked list using queue
        linkedList.offer(12);
        linkedList.offer(24);
        linkedList.offer(36);
        linkedList.offer(48);

        System.out.println(linkedList);
        

        // Pop 
        System.out.println(linkedList.poll());

        // Peek 
        System.out.println(linkedList.peek());

        // addfirst
        linkedList.addFirst(56);
        System.out.println(linkedList);
    }
}
