
class Printer{

    static <T> void print(T[] obj){
        for(T ele: obj){
            System.out.println(ele);
        }
    }
}

public class GenericExample {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Integer[] arr = {1, 2, 3, 4, 5};
        String[] str = {"Hello", "World"};
        
        //printing both array with same method 
        printer.print(arr);
        printer.print(str);
    }
}
