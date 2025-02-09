//Multilevel Inheritance

class ScientificCalculator extends AdvanCalculator{

    public int power(int n1, int n2){
        return (int)Math.pow(n1, n2);
    }
}

public class ScientificCalc {
    
    public static void main(String[] args) {
        
        ScientificCalculator obj1 = new ScientificCalculator();
        int r1 = obj1.add(6, 2);
        int r2 = obj1.sub(6, 2);
        int r3 = obj1.mul(6, 2);
        int r4 = obj1.div(6, 2);
        int r5 = obj1.power(6, 2);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);

    }
}
