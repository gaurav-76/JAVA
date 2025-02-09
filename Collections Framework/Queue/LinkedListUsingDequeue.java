import java.util.LinkedList;
import java.util.Deque;

public class LinkedListUsingDequeue {
    public static void main(String[] args) {
        
        Deque<Integer> linkedList = new LinkedList<>();
        
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

        // addlast
        linkedList.addLast(89);
        System.out.println(linkedList);

        //getfirst
        System.out.println(linkedList.getFirst());
        //getlast
        System.out.println(linkedList.getLast());

        //removefirst
        System.out.println(linkedList.removeFirst());
        //removelast
        System.out.println(linkedList.removeLast());

    

    }
}
