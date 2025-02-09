class Mobile{
    String brand;  // instance variable
    int price;    // instance variable
    static String name; // shared by all object
                        // need to acces with class name we can also access with 
                        // obj name but it is not good practice


    //Assume if we want to intialize the variable with default value
    Mobile(){
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }

    // we use static block to intialize the static variable
    // it will call once when class is loaded
    // becuase class loaded only once, it doesn't matter how many objects you create
    static{
        name = "Phone";
        System.out.println("in static");
    }

    // non static methods can access static variable
    void print(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class StaticBlock{
    public static void main(String[] args) throws ClassNotFoundException {
      
        // loading specific class
        Class.forName("Mobile");

        // if we comment all these object then even the class will not load
        // and the static block will not call
        // Mobile mb1 = new Mobile();
        // mb1.brand = "Apple";
        // mb1.price = 3400;

        // Mobile mb2 = new Mobile();


    

    }
}
