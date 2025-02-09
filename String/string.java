// Immutable strings

public class string {
    public static void main(String[] args) {
        
        String name1 = "Gaurav";
        String name2 = new String("Raman");
        
        String name3 = "Gaurav";
        String name4 = "gaurav";

        System.out.println(name1);
        System.out.println(name2);

        System.out.println(name1 == name2);

        System.out.println("Name 1 : " + name1.hashCode());
        System.out.println("Name 2 : " + name2.hashCode());

        System.out.println(name1 == name3);
        System.out.println("Name 3 : " + name3.hashCode());
        System.out.println("Name 4 : " + name4.hashCode());
    }    
}
