
//Mutable strings Thread safe

public class StringBufferExample {
    
    public static void main(String[] args) {
        
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer("Gaurav");
        System.out.println(sb1.capacity() + " " + sb2.capacity());

        System.out.println(sb1.length() + " " + sb2.length());
        sb1.append("Kumar");
        System.out.println(sb1.length() + " " + sb2.length());

        //We can also set capacity
        StringBuffer sb3 = new StringBuffer(30);
        System.out.println(sb3.capacity());
        sb3.append("gaurav");
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());

        //Not thread safe
        //all methods same as string buffer
        StringBuilder sbl1 = new StringBuilder("gaurav");
        System.out.println(sbl1);
    }
}
