
class GauravException extends Exception{
    GauravException(String str){
        super(str); //calling parent class constructor 
    }
}

public class CustomException {
    public static void main(String[] args) {
        
        int i = 20;
        int j = 0;

        try{
            j = 8 / i;
            if(j == 0){
                throw new GauravException("j shouldn't be zero");
            }
        }
        catch(GauravException e){
            j = 18 / 1;
            System.out.println("default value " + e);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(j);
        System.out.println("Hello");
    }
}
