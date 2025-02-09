
public class TryCatch {
    
    public static void main(String[] args) {
        
        int i = 0;
        int j = 0;

        System.out.println(j);
        try{

            j = 8 / i;

        }catch(ArithmeticException e){

            System.out.println("Divide by Zero ");

        }

        System.out.println("Hello");
    }
}
