class Mobile{
    String brand;
    int price;
    static String name; // shared by all object
                        // need to acces with class name we can also access with 
                        // obj name but it is not good practice

    // non static methods can access static variable
    void print(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class StaticVariable {
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

        mb1.print();
        mb2.print();

    }
}
