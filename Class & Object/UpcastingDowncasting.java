class A{
    public void show1(){
        System.out.println("in A show");
    }
}

class B extends A{
    public void show2(){
        System.out.println("in B show");
    }
}
public class UpcastingDowncasting{
    public static void main(String[] args) {
        
        double d = 4.5;
        int    a = (int) d; //typecasting

        System.out.println(a);

        //upcasting - going up from B to A 
        A obj = (A) new B();
        obj.show1();

        //downcasting - going down from A to B
        B obj1 = (B) obj;
        obj1.show2();

    }
}