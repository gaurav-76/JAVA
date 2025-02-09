public class NewSwitch {
    public static void main(String[] args) {
        
        //switch without break statment
        //new changes after java 12
        
        String s = "Tuesday";

        // switch(s){
        //     case "Saturday", "Sunday" -> System.out.println("Holiday");
        //     case "Monday", "Wednesday", "Friday" -> System.out.println("Maths class");
        //     case "Tuesday", "Thursday" -> System.out.println("Science class");
        //     default -> System.out.println("Please enter valid day");
        // }

        //switch as expression

        //using yield keyword
        String result1 = "";
        // result = switch(s){
        //     case "Saturday", "Sunday" : yield "Holiday";
        //     case "Monday", "Wednesday", "Friday" : yield "Maths class";
        //     case "Tuesday", "Thursday" : yield "Science class";
        //     default : yield "Please enter valid day";  
        // };

        //using -> returning value from switch
        result1 = switch(s){
            case "Saturday", "Sunday" -> "Holiday";
            case "Monday", "Wednesday", "Friday" -> "Maths class";
            case "Tuesday", "Thursday" -> "Science class";
            default -> "Please enter valid day";  
        };

        System.out.println(result1);
    }
}
