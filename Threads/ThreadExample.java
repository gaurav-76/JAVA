
//Thread - Threads allows a program to operate more efficiently by doing multiple things at the same time.
//Every thread has run() method it is compulsory
//if cpu has 1 core it means it can run 1 thread at a time
//if cpu has 4 core it means it can run 4 threads at a time simultaneously
//if cpu has 8 core it means it can run 8 threads at a time simlutaneously

//Example - google doc(giving word suggestion, correcting syntax) - multiple threads
//        - code editor(code suggestion, showing error)


// 2  ways to create Thread
// By extending Thread Class
// By implementing Runnable Interface

//Thread class implementing Runnable interface

class A extends Thread{
    public void run(){
        for(int i = 0; i <= 100; i++){
            System.out.println("Hi");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i = 0; i <= 100; i++){
            System.out.println("Hello");
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}
