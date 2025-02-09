

@FunctionalInterface
interface A{
    int add(int i, int j);
}

public class ReturnLambdaExpression {
    public static void main(String[] args) {
        
        // A obj = new A(){
        //     public int add(int i, int j){
        //         return i + j;
        //     }
        // };

        A obj = (i, j) -> i + j;
        
        //no need to mention variable type and return statment
        //A obj = (i, j) -> return i + j;

        int result = obj.add(5, 10);
        System.out.println(result);
    }
}
