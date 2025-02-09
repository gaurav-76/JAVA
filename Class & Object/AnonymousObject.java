class A{

    A(){
        System.out.println("in constructor");
    }

    public void show(){
        System.out.println("Show printed");
    }
}

public class AnonymousObject {
    public static void main(String[] args) {
        
        new A(); //anonymous object we can never use this object more than one time
        new A().show();
    }
}
