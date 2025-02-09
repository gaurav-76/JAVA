class A{
    public void show(){
        System.out.println("in A show");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        
        //anonymous inner class
        A obj = new A(){
            //providing another implementation for show method
            public void show(){
                System.out.println("in new show");
            }
        };

        obj.show();
    }
}
