import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamMethodsImplementation {
    
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(2,5,1,6,4,8,12,10);

        // Stream<Integer> s = nums.stream().
        //                          filter(n -> n % 2 == 0).
        //                          map(n -> n * 2).
        //                          sorted();

        // s.forEach(n -> System.out.println(n));

        //Method implementation
        //filer(n -> n % 2 == 0)
        //without lambda expression
        // Predicate<Integer> pd = new Predicate<Integer>() {
        //     public boolean test(Integer n){
        //         return n % 2 == 0;
        //     }
        // };

        //lambda expression
        Predicate<Integer> pd = n -> n % 2 == 0;

        //map(n -> n * 2)
        //without lambda expression
        // Function<Integer, Integer> func = new Function<Integer, Integer>() {
        //     public Integer apply(Integer n){
        //         return n * 2;
        //     }
        // };

        //lambda expression
        Function<Integer, Integer> func = n -> n * 2;
            
            
        //sorted()
        // - 1 : n1 < n2
        //   0 : n1 == n2
        //   1 : n1 > n2
        // Comparator<Integer> cmp = new Comparator<Integer>() {
        //     public int compare(Integer n1, Integer n2){
        //         return n1 > n2 ? -1 : 1;
        //     }
        // };

        //lambda expression
        Comparator<Integer> cmp = (n1, n2) -> n1 > n2 ? -1 : 1;
           

        Stream<Integer> s = nums.stream().
                                 filter(pd).
                                 map(func).
                                 sorted(cmp);

        s.forEach(n -> System.out.println(n));
    }
}
