class Human{

    private int age;
    private String name;

    //Default constructor
    public Human(){
        age = 12;
        name = "Gaurav";
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

public class Constructor {
    public static void main(String[] args) {
        
        Human h1 = new Human();

        System.out.println(h1.getName() + " : " + h1.getAge());

    }
}
