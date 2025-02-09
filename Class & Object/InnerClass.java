
class A{
    int age;

    public void show(){
        System.out.println("in A class");
    }

    //class inside class is known as inner class
    class B{
        public void show(){
            System.out.println("in B class");
        }
    }

    static class C{
        public void show(){
            System.out.println("in C class");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
       
        A obj = new A();
        obj.show();

        
        //this will give error
        //A.B obj1 = new A.B();
        //you need to use A object to create obj of B if B is not static class
        A.B obj1 = obj.new B();
        obj1.show();

        //if inner class is static then we can create object using outer class name
        A.C obj2 = new A.C();
        obj2.show();
        
    }
}
