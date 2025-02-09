
public class MethodsInString {
    public static void main(String[] args) {
        
        String n1 = "Gaurav";
        String n2 = "Gaurav";
        String n3 = "gaurav";

        //Get index element
        System.out.println(n1.charAt(0));
        System.out.println(n1.charAt(4));

        //Length
        System.out.println(n1.length());
        
        // == checks address of string object
        // n1.equals(n2) compare value of string object
        System.out.println("== :" + n1 == n2);
        System.out.println("Equals :" + n1.equals(n2));
        //ignore case
        System.out.println(n1.equalsIgnoreCase(n3));

        //Concatenation
        //using + operator
        System.out.println(n1 +" "+ n2);
        //n1.concat("Kumar") or n1.concat(n2)
        System.out.println(n1.concat(" Kumar"));

        //substring(startidx(inclusive), endidx(exclusive))
        System.out.println(n1.substring(0,3));

        //replace('a', 'p') replace a with p
        System.out.println(n1.replace('a', 'p'));

        //lowercase
        System.out.println(n1.toLowerCase());
        //uppercase
        System.out.println(n1.toUpperCase());

        //If we want to upper case only 1st character 
        System.out.println(n1.substring(0,2).toUpperCase() + n1.substring(1));
        
        //another way
        System.out.println(Character.toUpperCase(n1.charAt(0)) + n1.substring(1));

        //compareTo()
        //	An int value: 0 if the string is equal to the other string.
        // < 0 if the string is lexicographically less than the other string
        // > 0 if the string is lexicographically greater than the other string (more characters)
        System.out.println(n1.compareTo(n3));

        //Join : if we want to join multiple string together
        String all = String.join(n1, n2, n3, " Kumar");
        System.out.println(all);

        //Searching string
        //indexOf('a') give first occurence of a character or substring
        System.out.println(n1.indexOf('a'));
        //lastIndexOf('a') give last occurence of a character or substring
        System.out.println(n1.lastIndexOf('a'));

        String s = "Hi, How are you?";
        System.out.println(s.indexOf("Hi"));
        System.out.println(s.indexOf("Hi", 5)); // start searching from 5 index to end
        System.out.println(s.lastIndexOf("Hi", 5)); // start searching from 0 to index 5

        //String to int conversion or vice versa
        String str = "123";
        // 2 ways
        int num1 = Integer.parseInt(str);
        int num2 = Integer.valueOf(str);
        System.out.println(num1 + " " + num2);
        
        //Integer to string
        int num = 123;
        String s1 = Integer.toString(num);
        String s2 = String.valueOf(num);
        System.out.println(s1 + " " + s2);
    }
}
