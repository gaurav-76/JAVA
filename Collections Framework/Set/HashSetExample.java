import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        
        Set<Integer> hashSet = new HashSet<>();

        hashSet.add(40);
        hashSet.add(20);
        hashSet.add(50);
        hashSet.add(30);
        hashSet.add(10);

        System.out.println(hashSet);

        hashSet.remove(30);
        System.out.println(hashSet);

        System.out.println(hashSet.contains(40));

        System.out.println(hashSet.size());

        System.out.println(hashSet.isEmpty());

        hashSet.clear();
        System.out.println(hashSet);

    }
}
