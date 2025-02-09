import java.util.Stack;

class StackExample{
    public static void main(String[] args) {
        
        Stack<String> animals = new Stack<>();
        
        // Push
        animals.push("lion");
        animals.push("horse");
        animals.push("Cat");
        animals.push("dog");
        
        System.out.println("Stack : " + animals);
           
        // Top Most Element peek()
         System.out.println(animals.peek());
      
         
        // Pop
        animals.pop();
        System.out.println("Stack : " + animals); 
        
        // Checking is stack is empty or not
        // empty = true  , not empty = false
        System.out.println(animals.empty());
        
        // size
        System.out.println(animals.size());

        // search(element)
        // if found return index else return -1
        System.out.println(animals.search("Cat"));
    }
}