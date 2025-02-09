import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderExample {
    public static void main(String[] args) throws IOException {
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter number");
        int n1 = Integer.parseInt(br.readLine());
        System.out.println(n1);

        System.out.println("Enter float number");
        float n2 = Float.parseFloat(br.readLine());
        System.out.println(n2);

        System.out.println("Enter string");
        String n3 = br.readLine();
        System.out.println(n3);

        // it is good practice to close buffered reader
        br.close();
    }
}
