
//LTVI - Local Type Variable Interference

// var is same as auto in cpp
// can referance any data type vaule

//var cannot be used as class name
// class var{

// }

public class varExample {
    public static void main(String[] args) {
        
        int n1 = 10;
        var v1  = 10;

        int n2;
        //this will give error
        //it is compulsory to iniatliaze value when you using var
        //var v2;

        // we can aslo used var as variable name
        String var = "Gaurav";
        System.out.println(var);

        //array declaration
        int arr[] = new int[10];
        var arr1 = new int[10];

        //this is also right
        //var obj = new A();

    }
}
