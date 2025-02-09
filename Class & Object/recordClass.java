

//record class - is used to store data only
// object of this class are immutable
//record class can't extend any other class but can implement interface

//normal class vs record class
//can't print object for, that we need to override toString() method
//can't compare object values for that we need to override hashCode() and equals() method

//record class can do in easy steps

//paramaterized constructor are provided by default no need to define

//record class obj can be used where we are getting data from any servers and db
record Alien(int id, String name){

}

public class recordClass {
    public static void main(String[] args) {
        
        Alien a1 = new Alien(1, "Gaurav");
        Alien a2 = new Alien(1, "Gaurav");

        System.out.println(a1);
        System.out.println(a1.equals(a2));

        //also we can use object with variable name to get value
        //there is not any getter method
        System.out.println(a1.name());
    }
}
