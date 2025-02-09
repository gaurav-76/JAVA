
public class MultipleCatchBlock {
    public static void main(String[] args) {
        
        int i = 2;
        int j = 0;

        //String str = null;
        int arr[] = new int[5];

        try{
            j = 8 / i;
            //System.out.println(str.length());
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(j);
        System.out.println("Hello");
    }
}
