
//abstract class - any class can extend
//final class - no class can extend

//sealed class - classes that are permitted can extend not other than that

//permits statement should be last in class after extend and implements if they are

//example - sealed class A extends Thread implements Clonable permits B,C

sealed class A permits B,C{

}

//it is compulsory to make permitted/subclass class either
//sealed , non-sealed, final. else it will give error

//any class can extend b
non-sealed class B extends A{

}

//no class can extend c
final class C extends A{

}

// class D{

// }

//class d extend b as it is non-sealed class
class D extends B{

}

//interface can also be sealed
//interface can't be final
sealed interface X permits Y{

}

//subinterface can be sealed or non-sealed , but can't final
sealed interface Y extends X{

}

public class SealedClass {
    public static void main(String[] args) {
        
    }
}
