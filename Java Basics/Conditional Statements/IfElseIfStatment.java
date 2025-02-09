
public class IfElseIfStatment {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 43;
        int c = 34;

        if(a > b && a > c){
            System.out.println("A");
        }
        else if(b > a && b > c){
            System.out.println("B");
        }
        else{
            System.out.println("C");
        }
    }    
}
