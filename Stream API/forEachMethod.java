import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class forEachMethod {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(1,2,3,4,6,8,7);

        // Consumer<Integer> con = new Consumer<Integer>() {
        //     public void accept(Integer n){
        //         System.out.println(n);
        //     }
        // };


        //lambda expression
        //its working in online editor some issue in vs ide
        Consumer<Integer> con = n -> System.out.println(n);
        
        //Way 1 - anonymous inner class
        nums.forEach(con);

        //Way 3
        //nums.forEach(n -> System.out.println(n));
    }    
}
