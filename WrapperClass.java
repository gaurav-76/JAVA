public class WrapperClass {
    public static void main(String[] args) {
        
        int num = 7;
        //Integer num1 = new Integer(num); // boxing
        //// auto-boxing : automatically storing value into integer object
        Integer num1 = num; 

        System.out.println(num1);

        //int num2 = num1.intValue(); //unboxing
        //auto-unboxing : automatically unboxing value from integer object and storing in int data type
        int num2 = num1; 

        System.out.println(num2);

        //intValue() is method of wrapper class
    }
}
