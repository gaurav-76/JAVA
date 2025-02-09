
// class - class -> extends
// interface - interface -> extends
// class - interface -> implements

interface A{
    void show();
    void config();
}

interface B extends A{
    void run();
}

interface D extends A{

}

//this will also work
//class C implements A,B
class C implements D,B{
    public void show(){
        System.out.println("in B show");
    }

    public void config(){
        System.out.println("in B config");
    }

    public void run(){
        System.out.println("running..");
    }
}
public class MultipleInterface {
    
    public static void main(String[] args) {
        
        A obj = new C();
        obj.show();
        obj.config();
       
        //we cannot call with A refernce beacuse it will not aware about method of B
        B obj1 = new C();
        obj1.run();
    }
}
