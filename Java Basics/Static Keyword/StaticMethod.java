class Mobile{
    String brand;  // instance variable
    int price;    // instance variable
    static String name; // shared by all object
                        // need to acces with class name we can also access with 
                        // obj name but it is not good practice

    // non static methods can access static variable
    void print(){
        System.out.println(brand + " : " + price + " : " + name);
    }

    // we can not use instance variable directly in static methods because these variable 
    // will have different value for different objects
    // to use instance variable in static methods we need to pass object as refrence
    // static void print1(){
    //     System.out.println(brand + " : " + price + " : " + name); // this will give error
    // }

    static void print1(Mobile obj){
        System.out.println(obj.brand + " : " + obj.price + " : " + name); // this will give error
    }
}

public class StaticMethod{
    public static void main(String[] args) {
        
        Mobile mb1 = new Mobile();
        mb1.brand = "Apple";
        mb1.price = 3400;

        Mobile mb2 = new Mobile();
        mb2.brand = "Samsung";
        mb2.price = 4500;

        // We want this name should be common to all so that's why it is declared
        // as static
        Mobile.name = "Phone";

        Mobile.print1(mb1);

    }
}
