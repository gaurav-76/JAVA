import java.util.Arrays;

public class SortingStringandAnagram {
    public static void main(String[] args) {
        
        String s1 = "Gaurav";
        String s2 = "GauRab";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        //if we want to sort this string first we need to convert
        // into char [] 
        // then we can use Arrays sort method

        char [] cs1 = s1.toCharArray();
        char [] cs2 = s2.toCharArray();

        Arrays.sort(cs1);
        Arrays.sort(cs2);

        boolean flag = Arrays.equals(cs1, cs2);

        if(flag == true){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }


    }
}
