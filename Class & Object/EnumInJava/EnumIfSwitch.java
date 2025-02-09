
//extends Enum class
enum Status{
    Running, Failed, Pending, Success; 
}


public class EnumIfSwitch {
    public static void main(String[] args) {
        
        Status s = Status.Success;

        if(s == Status.Running){
            System.out.println("Running status..");
        }
        else if(s == Status.Failed){
            System.out.println("Failed status..");
        }
        else if(s == Status.Pending){
            System.out.println("Pending status..");
        }
        else{
            System.out.println("Success status..");
        }

        switch (s) {
            case Running: System.out.println("Running status..");
                          break;
            
            case Failed: System.out.println("Failed status..");
                          break;        
            
            case Pending: System.out.println("Pending status..");
                          break;
            default: System.out.println("Success status..");
                          break;
        }
    }    
}
