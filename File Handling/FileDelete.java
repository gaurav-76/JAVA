import java.io.File;

public class FileDelete {
    public static void main(String[] args) {
        
        File myFile = new File("hello.txt");

        if(myFile.delete()){
            System.out.println("I have deleted file:" + myFile.getName());
        }
        else{
            System.out.println("File not found");
        }
    }
}
