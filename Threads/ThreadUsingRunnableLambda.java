
// as runnable is functiona interface we don't need to create class A and B
//we can use anonymous inner class

public class ThreadUsingRunnableLambda {
    public static void main(String[] args) {
        
        //anonymous class without lambda expression
        Runnable obj1 = new Runnable(){
            public void run(){
                for(int i = 0; i <= 5; i++){
                    System.out.println("Hi");
                    try{
                        Thread.sleep(10); 
                    }catch(InterruptedException e){
        
                    }
                }
            }
        };

        //lambda expression anonymous class
        Runnable obj2 = () -> {
                for(int i = 0; i <= 5; i++){
                    System.out.println("Hello");
                    try{
                        Thread.sleep(10); 
                    }catch(InterruptedException e){
        
                    }
                }
            };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
        
    }
}
