import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        
        try{
            FileReader fileReader = new FileReader("hello.txt");
            Scanner sc = new Scanner(fileReader);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
