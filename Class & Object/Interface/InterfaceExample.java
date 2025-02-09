

//types
//Normal Interface - more than 1 methods
//Functional Interface/Single Abstract Method(SAM) - 1 Method
//Marker Interface - no method , empty interface

interface A{
    void show();
    void config();
}

class B implements A{
    public void show(){
        System.out.println("in B show");
    }

    public void config(){
        System.out.println("in B config");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        
        //creating refrence of interface and object of class B
        //gives error
        A obj = new A();
        A obj = new B();
        obj.show();
        obj.config();
    }    
}
