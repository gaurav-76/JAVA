class Human{

    private int age;
    private String name;

    //Default constructor
    public Human(){
        age = 12;
        name = "Gaurav";
    }

    //Paramaterized Constructor
    public Human(int age, String name){
        this.age = age;
        this.name = name;
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

public class ConstructorOverloading {
    public static void main(String[] args) {
        
        Human hobj1 = new Human();
        Human hobj2 = new Human(18, "Raman");

        System.out.println(hobj1.getName() + " : " + hobj1.getAge());
        System.out.println(hobj2.getName() + " : " + hobj2.getAge());
    }
}
