import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionClassExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(23);
        list.add(43);
        list.add(54);
        list.add(44);
        list.add(65);
        list.add(44);
        list.add(76);

        List<Integer> list1 = new ArrayList<>();

        list.add(23);
        list.add(43);
        list.add(54);
        list.add(98);
        list.add(65);
        list.add(86);
        list.add(76);

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(Collections.frequency(list, 44));

        Collections.sort(list); // sorting in increasing order
        System.out.println(list);
        Collections.sort(list, Comparator.reverseOrder()); // sorting in decreasing order
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        // if diff elements present then returns true or else false
        System.out.println(Collections.disjoint(list, list1));

        //replaceAll​(List<T> list, T oldVal, T newVal) - This method replaces all occurrences of one specified value in a list with another.
        Collections.replaceAll(list, 44, 444);
        System.out.println(list);

        //rotate
        //rotate​(List<?> list, int distance) - This method rotates the elements in the specified list by the specified distance.
        Collections.rotate(list, 4);
        System.out.println(list);

        //swap​(List<?> list, int i, int j) - This method swaps the elements at the specified positions in the specified list.
        Collections.swap(list, 0,2);
        System.out.println(list);
    }
}
