
//function interface is a interface which has only 1 method 
@FunctionalInterface
interface A{
    void show();
}

public class FunctionalInterfaceExamples {
    public static void main(String[] args) {
        

        //inner class obj
        A obj = new A() {
            public void show(){
                System.out.println("in show");
            }
        };

        obj.show();

        //Lambda expression only works with functional interface
    }
}
