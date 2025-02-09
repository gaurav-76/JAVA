
class Calculator{

    //Method overloading - no of parameter should be different in different methods
    // same no of parameters but different return type will give error
   
    // Every method has its own stack space
    public int add(int n1, int n2){
        return n1 + n2;    
    }

    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

    public double add(double n1, double n2){
        return n1 + n2;
    }

}

public class MethodOverloading {
    public static void main(String[] args) {
        
        Calculator calc  = new Calculator();
        System.out.println(calc.add(1, 2));
        System.out.println(calc.add(1, 2, 3));
        System.out.println(calc.add(1.01, 2.01));
    }    
}
