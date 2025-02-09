class DataType{
    public static void main(String[] args) {
        
        //DataType - Primitive , Non primitve
        //Primitive - Boolean , Numeric
        //Boolean - Boolean  , Numeric - Integral, Character
        //Integral - Integer, Floating Point
        //Character - char
        //Integer - byte, short, int, long
        //Floating point - float, double


        //Integer (2^byte to 2^byte - 1)
        byte  num1 = 23;  // 1 byte (-128 to 127) , default value - 0
        short num2 = 34;  // 2 bytes (-32768 to 32767) , default value - 0
        int   num3 = 3474; // 4 bytes  , default value - 0
        long  num4 = 493993922l; // 8 bytes  , default value - 0L

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

        //Floating Number
        float  num5 = 34.7f;  // 4 bytes , default value - 0.0f  storing 6 to 7 decimal digits
        double num6 = 4939393.655; //  8 bytes , default value - 0.0d storing 15 decimal digits
        
        System.out.println(num5);
        System.out.println(num6);

        //Character  (UNICODE)
        char ch = 'A'; // 2 bytes , default value - '\u0000'
        System.out.println(ch); 

        //Boolean
        boolean flag = true; // 1 bit , default value - false
        System.out.println(flag);

    
    }
}