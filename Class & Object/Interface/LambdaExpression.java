
//Lambda expression only works with functional interface
//beacuse in normal interface there may be more than 1 interface and at that time
//the lamba expression will not able to configure which method should call
// becuase we don't mention method name in lambda expression

@FunctionalInterface
interface A{
    void show(int i);
}

public class LambdaExpression {
    public static void main(String[] args) {
        
        //lambda expression ->
        // A obj = () -> System.out.println("in show");
        
        // obj.show();

        // single statement so we don't need {} braces, 
        // if multiple statements then use
        // A obj = () -> 
        //         {
        //            System.out.println("in show");
        //         }
        
        //we can also pass variable
        //we also don't need to specify variable type as it is define in interface
        // A obj1 = (i, j) -> System.out.println(i + " : " + j);
        // obj1.show(5, 10);

        //if 1 variable then we don't need to used () bracket
        A obj2 = i -> System.out.println(i);
        obj2.show(5);
    }
}
