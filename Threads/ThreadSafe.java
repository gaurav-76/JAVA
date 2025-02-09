
//Race condition - A condition in which the critical section (a part of the program where shared memory is accessed) is concurrently executed by two or more threads. 
//It leads to incorrect behavior of a program.

class Counter{
    
    int count;
    //giving incorrect count value everytime
    // public void increment(){
    //     count++;
    // }

    //synchronized - allows at a time only 1 thread can a shared method
    public synchronized void increment(){
        count++;
    } 
}

public class ThreadSafe {
    public static void main(String[] args) throws InterruptedException{
        
        Counter obj = new Counter();
        Runnable obj1 = new Runnable(){
            public void run(){
                for(int i = 1; i <= 1000; i++){
                    obj.increment();
                }
            }
        };

        //lambda expression anonymous class
        Runnable obj2 = () -> {
                for(int i = 1; i <= 1000; i++){
                    obj.increment();
                }
            };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        //we are using join() so that main method wait until the t1 and t2 completely execute
        t1.join();
        t2.join();

        System.out.println(obj.count);
    }    
}
