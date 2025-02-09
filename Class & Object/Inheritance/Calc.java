class Calculator{
    public int add(int n1, int n2){
        return n1 + n2;
    }

    public int sub(int n1, int n2){
        return n1 - n2;
    }
}

public class Calc {
    public static void main(String[] args) {
        
        Calculator obj1 = new Calculator();
        int r1 = obj1.add(3, 4);
        int r2 = obj1.sub(3, 4);

        System.out.println(r1 + " " + r2);
    }    
}
