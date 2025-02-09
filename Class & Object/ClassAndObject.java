
// class student
class Student{
    int rollNo;
    String name;

    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name   = name;
    }

    void print(){
        System.out.println("Roll No: "+ rollNo);
        System.out.println("Name : "+ name);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        
        // object creation
        Student student = new Student(1, "Gaurav");
        
        //calling method of class student using object
        student.print();

    }
}
