import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerExample{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element");
        BigInteger n1 = sc.nextBigInteger();
        BigInteger n2 = sc.nextBigInteger();

        BigInteger sum = n1.add(n2);
        BigInteger mul = n1.multiply(n2);

        System.out.println(sum);
        System.out.println(mul);
    }
}