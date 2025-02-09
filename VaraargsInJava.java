

class Add{
    public void calc(int ...nums){
        int sum = 0;
        for(int i = 0; i < nums.length; ++i){
            sum += nums[i];
            System.out.print(nums[i] + " ");
        }
        System.out.println(" : " + sum);
    }
}

public class VaraargsInJava {
    public static void main(String[] args) {
        
        //Variable Arguments (Varargs) in Java is a method that takes a variable number of arguments.
        //Syntax
        // public static void fun(int ... a) 
        // {
        // // method body
        // } 

        //using same method through vararags
        Add obj = new Add();
        obj.calc(1, 2);
        obj.calc(1, 2, 3);
        obj.calc(1, 2, 3, 4, 5);
        obj.calc(1, 2, 3, 4, 5, 6, 7, 8);

    }
}
