import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Push
        minHeap.offer(1);
        minHeap.offer(2);
        minHeap.offer(3);
        minHeap.offer(4);
        // add method to add element in pq
        minHeap.add(5);

        // clearing all data present in pq
        //minHeap.clear();
        System.out.println(minHeap);

        // contains if element present then return true else false
        System.out.println(minHeap.contains(30));

        // remove specific element
        minHeap.remove(3);
        System.out.println(minHeap);

        //Pop
        System.out.println(minHeap.poll());

        //Peek
        System.out.println(minHeap.peek());

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        // Push
        maxHeap.offer(10);
        maxHeap.offer(20);
        maxHeap.offer(30);
        maxHeap.offer(40);

        System.out.println(maxHeap);

        //Pop
        System.out.println(maxHeap.poll());

        //Peek
        System.out.println(maxHeap.peek());


    }
}
