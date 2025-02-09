import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyExample {
    
    public static void main(String[] args) throws IOException{
        
        //we can also write try without catch block
        //finally block can be used to close resources - like db connection etc
        //finally block will always execute no matter there is exception or not
        
        BufferedReader br = null;
        try{
            System.out.println("Enter number");
            br = new BufferedReader(new InputStreamReader(System.in));
            int n1 = Integer.parseInt(br.readLine());
            System.out.println(n1);
        }finally{
            br.close();
        }
    }
}
