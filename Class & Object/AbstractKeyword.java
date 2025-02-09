// abstract class can contain both abstract and normal methods
abstract class Car{

    // if you created an method and you don't have idea about implementaion
    //then define abstract method
    //abstract method can be defined in abstract class only
    public abstract void Drive();

    public void MusicPlay(){
        System.out.println("Music Playing..");
    }
}

//If any class inheriting any abstract class 
//then it is compulsory to implement all abstract methods 
class WagonR extends Car{
    public void Drive(){
        System.out.println("Driving..");
    }
}
public class AbstractKeyword {
    public static void main(String[] args) {
        
        // you can't create object of abstract class
        //Car obj = new Car();

        //but you can create reference of abstract class
        Car obj = new WagonR();
        obj.Drive();
        obj.MusicPlay();
    }
}
