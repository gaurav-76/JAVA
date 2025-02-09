
//We can also set priority to thread but its upto scheduler which thread it will schedule for execution first

//1 - least priority , 5 - default priority , 10 - max priority

class A extends Thread{
    public void run(){
        for(int i = 0; i <= 100; i++){
            System.out.println("Hi");
            // 10 millisecond scheduler will wait
            try{
                Thread.sleep(10); 
            }catch(InterruptedException e){

            }
            
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i = 0; i <= 100; i++){
            System.out.println("Hello");
            try{
                Thread.sleep(10); 
            }catch(InterruptedException e){
                
            }
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        
        A obj1 = new A();
        B obj2 = new B();

        // System.out.println(obj1.getPriority());
        // System.out.println(obj2.getPriority());

        // obj1.setPriority(Thread.MAX_PRIORITY);
        // System.out.println(obj1.getPriority());

        // obj2.setPriority(10);
        // System.out.println(obj2.getPriority());

        obj1.start();
        obj2.start();
    }
}
