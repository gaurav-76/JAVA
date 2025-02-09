
//Runnable interface is a functional interface 
//it contains only 1 method run()

class A implements Runnable{
    public void run(){
        for(int i = 0; i <= 5; i++){
            System.out.println("Hi");
            try{
                Thread.sleep(10); 
            }catch(InterruptedException e){

            }
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i = 0; i <= 5; i++){
            System.out.println("Hello");
            try{
                Thread.sleep(10); 
            }catch(InterruptedException e){

            }
        }
    }
}


public class ThreadUsingRunnable {
    public static void main(String[] args) {
        
        A obj1 = new A();
        B obj2 = new B();

        //now this will not work because runnable interface don't
        //have any method name start
        //obj1.start();
        //obj2.start();

        //solution is that create 2 thread and pass obj of both class
        //and call start() method through thread object
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
