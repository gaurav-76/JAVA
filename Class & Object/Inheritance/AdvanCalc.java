//single level inheritance

class AdvanCalculator extends Calculator{

    int mul(int n1, int n2){
        return n1 * n2;
    }

    int div(int n1, int n2){
        return n1 / n2;
    }
}

public class AdvanCalc {
    public static void main(String[] args) {
        
        AdvanCalculator obj1 = new AdvanCalculator();
        int r1 = obj1.add(6, 2);
        int r2 = obj1.sub(6, 2);
        int r3 = obj1.mul(6, 2);
        int r4 = obj1.div(6, 2);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }    
}
