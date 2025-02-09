import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//giving power to sort class object by implementing comparable interface
class Student implements Comparable<Student>{

    String name;
    int age;
    
    Student(String name, int age){
        this.name = name;
        this.age  = age;
    }

    public String toString() {
		return "Student [age=" + age + ", name=" +name +"]";
	}

    @Override
    public int compareTo(Student obj){
        return this.name.length() > obj.name.length() ? 1 : -1;
    }
}

public class ComparatorVSComparable {

    public static void main(String[] args) {
        
        // List<Integer> list = new ArrayList<>();
        // list.add(43);
        // list.add(54);
        // list.add(23);
        // list.add(21);
        // list.add(65);
        // list.add(33);

        // System.out.println(list);

        // // increasing order
        // Collections.sort(list);
        // System.out.println(list);
        // // now we want to sort the elements in decreasing order
        // Collections.sort(list, Collections.reverseOrder());
        // System.out.println(list);

/*---------------------Student---------------------- */
        
        System.out.println("-----Students----");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Gaurav", 22));
        students.add(new Student("Nitesh", 23));
        students.add(new Student("Diwakar", 20));
        students.add(new Student("Ashish", 21));

        System.out.println(students);

        // now we want to sort the student based on the age
        // first way comparator
        Comparator<Student> comparator = new Comparator<Student>() {
            public int compare(Student i, Student j){
                return i.age > j.age ? 1 : -1;
            }
        };
        //lambda expression (functional interface)
        Comparator<Student> comparator1 = (i, j) ->
                 i.age > j.age ? 1 : -1;
    
        
        // whose age is less will print first
        System.out.println("Comparator");
        Collections.sort(students, comparator);
        for (Student student : students) {
            System.out.println(student);
        }

        // whose name length is less will print first
        System.out.println("Comparable");
        //due to this sort we are implementing comparable interface
        //becuase we are not passing any other object (cmp/comp) in sort method
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}



/* Example Code
 
import java.util.*;

class Checker implements Comparator<Player> {
    
    @Override
    public int compare(Player p1, Player p2) {
        if(p1.score == p2.score) {
            return p1.name.compareTo(p2.name);
        }
        return p2.score - p1.score;
    }
}

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
 
 */