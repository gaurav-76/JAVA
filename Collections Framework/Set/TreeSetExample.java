import java.util.TreeSet;
import java.util.Set;

public class TreeSetExample {
    public static void main(String[] args) {
        
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(40);
        treeSet.add(20);
        treeSet.add(50);
        treeSet.add(30);
        treeSet.add(10);

        System.out.println(treeSet);

        treeSet.remove(30);
        System.out.println(treeSet);

        System.out.println(treeSet.contains(40));

        System.out.println(treeSet.size());

        System.out.println(treeSet.isEmpty());

        treeSet.clear();
        System.out.println(treeSet);

    }
}


