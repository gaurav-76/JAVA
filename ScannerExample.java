import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integer number : ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter float number : ");
        float num2 = sc.nextFloat();
        
        System.out.println("Enter string : ");
        String num3 = sc.next();

        int num4 = sc.nextInt();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }
}
