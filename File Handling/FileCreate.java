import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {
        
        File myFile = new File("hello.txt");
        try{
            //will create file
            myFile.createNewFile();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        
    }    
}
