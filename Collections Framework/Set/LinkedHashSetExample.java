import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        
        Set<Integer> lhashSet = new LinkedHashSet<>();

        lhashSet.add(40);
        lhashSet.add(20);
        lhashSet.add(50);
        lhashSet.add(30);
        lhashSet.add(10);

        System.out.println(lhashSet);

        lhashSet.remove(30);
        System.out.println(lhashSet);

        System.out.println(lhashSet.contains(40));

        System.out.println(lhashSet.size());

        System.out.println(lhashSet.isEmpty());

        lhashSet.clear();
        System.out.println(lhashSet);

    }
}

