
class A{
    public void show() throws ClassNotFoundException{
        Class.forName("B");
    }
}
public class throwsInExceptionHandling {

    static{
        System.out.println("Class loaded");
    }
    public static void main(String[] args) {
        
        A obj = new A();

        try{
            obj.show();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
