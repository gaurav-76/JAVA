
//class
enum Status{
    //named constants (all are objects)
    Running, Failed, Pending, Success;
}

public class EnumBasic {
    public static void main(String[] args) {
        
        Status s = Status.Pending;
        System.out.println(s);

        //if we want to know index
        System.out.println(s.ordinal());

        //geting all values
        Status [] ss = Status.values();
        for(Status e: ss){
            System.out.println(e + " : " + e.ordinal());
        }
    }    
}
