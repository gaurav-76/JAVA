import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class OddEven {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(1,2,3,4,6,8,7);

        //only 1 time a stream is used
        // Stream<Integer> s1 = nums.stream(); 
        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0); 
        // Stream<Integer> s3 = s2.map(n -> n*2);


        //single statement
        Stream<Integer> s4 = nums.stream().
                                  filter(n -> n % 2 == 0).
                                  map(n -> n * 2);
        s4.forEach(n -> System.out.println(n));

    }    
}
