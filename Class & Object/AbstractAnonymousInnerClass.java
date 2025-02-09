abstract class A{
    public abstract void show();

    public abstract void config();
}

public class AbstractAnonymousInnerClass {
    public static void main(String[] args) {
        
        //giving error
        //A obj = new A();

        // we are not creating object of abstract class A
        // instead the anonymous inner class object is created
        A obj = new A(){
            public void show(){
                System.out.println("in new show");
            }

            public void config(){
                System.out.println("in new config");
            }
        };

        obj.show();
        obj.config();
    }
}
