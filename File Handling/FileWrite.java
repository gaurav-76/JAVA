import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        
        try{
            //if file will not present then it will create file
            FileWriter fileWriter = new FileWriter("hello.txt");
            fileWriter.write("Hi Gaurav \n what are you doing?");
            fileWriter.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        
    }    
}
