public class LogicalOperator {
    public static void main(String[] args) {
        
        int num1 = 45;
        int num2 = 56;

        // logical operator
        boolean result1 = num1 < num2 && num1 > num2;
        boolean result2 = num1 < num2 || num1 > num2;
        System.out.println(result1);
        System.out.println(result2);

        // also known as bitwise operator
        boolean result3 = num1 > num2 & num1 > num2;
        boolean result4 = num1 > num2  | num1 > num2;
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(!result4);

        int a = 5;
        int b = 3;
        System.out.println(a ^ b);

        // bitwise complement ( return 1s complement)
        System.out.println(~2);
    }
}
