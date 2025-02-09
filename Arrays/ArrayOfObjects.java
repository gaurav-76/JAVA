// class declaration
class Student{
    int rollNo;
    String name;
    int marks;
} // after class closing }  ; not required in java unlike in cpp

public class ArrayOfObjects {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name   = "Gaurav";
        s1.marks  = 65;

        Student s2 = new Student();
        s2.rollNo  = 2;
        s2.name    = "Nitesh";
        s2.marks   = 76;

        Student s3 = new Student();
        s3.rollNo  = 3;
        s3.name    = "Ashish";
        s3.marks   = 46;

        // Array of objects
        // it will hold 3 student objects address
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // normal for loop
        for(int i = 0; i < students.length; i++){
            System.out.println(students[i].rollNo + " : " + students[i].name + " : " + students[i].marks);
        }

        //Enhanced for loop - for each loop
        System.out.println("Enhanced for loop");
        // var keyword is like auto in cpp. Can hold any data type value
        for(var student : students){
            System.out.println(student.rollNo + " : " + student.name + " : " + student.marks);
        }

        for(Student student : students){
            System.out.println(student.rollNo + " : " + student.name + " : " + student.marks);
        }
    }
}
