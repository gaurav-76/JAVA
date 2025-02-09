public class TypeConversion {
    public static void main(String[] args) {
        
        byte b = 34;
        int num = b; // implicit conversion

        System.out.println(num);

        int num2 = 45;
        byte b1 = (byte) num2; // Explicit casting / conversion

        System.out.println(b1);

        int num3 = 258;
        byte b2 = (byte) num3;  // 258 % 256(size of byte) 
        System.out.println(b2);

        byte b3 = 10;
        byte b4 = 30;
        int num4 = b3 * b4; // type promotion
        System.out.println(num4);

    }
}
