public class OldSwitch {
    public static void main(String[] args) {
        
        //switch accept these data types
        //byte, short, int, long, char (with its wrapper type), enums, string

        int n = 3;

        switch(n){
            case 1: System.out.println("Sunday");
                    break;
            case 2: System.out.println("Monday");
                    break;
            case 3: System.out.println("Tuesday");
                    break;
            case 4: System.out.println("Wednesday");
                    break;
            case 5: System.out.println("Thursday");
                    break;
            case 6: System.out.println("Friday");
                    break;
            case 7: System.out.println("Saturday");
                    break;
            default: System.out.println("Please enter a valid number");
                    break;
        }

        // this is also working
        // String s = "Yes";
        // switch(s){
        //     case "Yes": System.out.println("You selected yes");
        //             break;
        //     case "No": System.out.println("You selected no");
        //             break;
        //     default: System.out.println("Please enter a valid number");
        //             break;
        // }
    }
}
