
// class A{

        //if any method may throw exception than we can use throws exception
//     public int num(int n) throws Exception{
//         if(n == 0){
//             throw new Exception("");
//         }

//         return 0;
//     }

// }


public class throwInExceptionHandling {
    
    public static void main(String[] args) {
        
        int i = 20;
        int j = 0;

        try{
            j = 8 / i;
            if(j == 0){
                throw new ArithmeticException("j shouldn't be zero");
            }
        }
        catch(ArithmeticException e){
            j = 18 / 1;
            System.out.println("default value " + e);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(j);
        System.out.println("Hello");

    }
}
