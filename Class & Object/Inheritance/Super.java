class A{

    public A(){
        System.out.println("in A");
    }

    public A(int n){
        System.out.println("in A int");
    }
}

// super() - calls super class constructor
// this() - call same class constructor

// if even we not include super() in sub class constructor it will still call
// super/ parent class constructor first
class B extends A{
    
    public B(){
        super(5);
        System.out.println("in B");
    }

    public B(int n){
        this();
        System.out.println("in B int");
    }

}


public class Super {
    public static void main(String[] args) {
        
        B obj = new B(5);

        // order of execution
        // b(int n) -> b() -> a(int n)
        // while return prints a(int n) -> b() -> b(int n)
    }   
}
