import java.util.ArrayList;
import java.util.Arrays;

public class SplitString {
    public static void main(String[] args) {
        
        //Split string based on some delimeter

        String s = "He is a very very good boy, isn't he?";

        //want to separate based on white spaces
        //String [] arr = s.split("\\s");

        //want to separated based on '
        //String [] arr = s.split("'");

        //giving multiple delimeters
        //trim() is used to remove all leading and trailing spaces

        //before using split() always check whether string has element or not
        String [] arr = s.trim().split("[ !,?._'@+]");
        
        ArrayList<String> str = new ArrayList<>(Arrays.asList(arr));
        for(String s1: str){
            System.out.println(s1);
        }
    }
}
