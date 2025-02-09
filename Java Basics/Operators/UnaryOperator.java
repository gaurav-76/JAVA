public class UnaryOperator {
    public static void main(String[] args) {
        
        int num = 45;

        System.out.println(++num); //pre increment
        System.out.println(num++); //post increment
        System.out.println(--num); //pre decrement 
        System.out.println(num--); //post decrememt
        System.out.println(~(5));  //bitwise complement(1s complement)
        System.out.println(-(num)); //unary minus
    }
}
