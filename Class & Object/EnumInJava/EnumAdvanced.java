
enum Laptop{
    Mackbook(3000), Lenevo(200), Dell, HP(400);

    private int price;

    private Laptop(){
        price = 450;
        System.out.println("in " + this.name());
    }

    private Laptop(int price){
        this.price = price;
        System.out.println("in " + this.name());
    }

    public int getPrice(){
        return price;
    }
}

public class EnumAdvanced {
    public static void main(String[] args) {
        
        Laptop [] lap = Laptop.values();

        for(Laptop lp: lap){
            System.out.println(lp + " : " + lp.getPrice());
        }
    }    
}
