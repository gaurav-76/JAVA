import java.util.*;
import java.util.ArrayList;
import java.util.List;


class ArrayListExample{
    public static void main(String[] args) {
        
/*************************************   Array Declaration  **************************************** */ 
        // intital capacity 10
        // how array list size grows
        // size = n; 
        // n + n/2 + 1
        //ArrayList<String> students = new ArrayList(); // this is also correct
        ArrayList<String> students = new ArrayList<>();
        students.add("Gaurav");
        students.add("Raman");
        students.add("Ashish");
        
        /* In Java, the default capacity of an ArrayList is not directly accessible via a public method, but it is known to be 10. */
        // predefined size of array list
        ArrayList<String> students1 = new ArrayList<>(20);
        
        System.out.println(students);
        System.out.println(students.size());
        
       
        
/*************************************   Add  **************************************** */         
       // List<Integer> list = new ArrayList(); // this is also correct
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(4);  // adds element at end
        System.out.println(list);
        
        //insert at specific position (index, element)
        list.add(1,5);
        System.out.println(list);
        
        List<Integer> newList = new ArrayList<>();
        newList.add(150);
        newList.add(160);
        list.addAll(newList); // adds 1 list all element into another list
        System.out.println(list);
        
        // insert new list from pos 1 (index, listName)
        list.addAll(1,newList);

/*************************************   Get Element (index)  **************************************** */         
        System.out.println(list.get(1));

/*************************************   Empty  **************************************** */ 
        System.out.println(list.isEmpty());
        
/*************************************   Occurence of Element  **************************************** */ 
        //Index of first occurence of element(index)
         System.out.println(list.indexOf(5));
         System.out.println(list.lastIndexOf(5));

/*************************************  Remove  **************************************** */ 
        list.remove(1); 
        System.out.println(list);
        
        // want to remove specific element
        list.remove(Integer.valueOf(4));
        System.out.println(list);   

        // Remove from range
        //list.removeRange(0,2);// not working this command


/*************************************   Sublist  **************************************** */ 
        // sublist (startindex inclusive, lastindex exclusive)
        List<Integer> list1 = list.subList(2,4);


/*************************************   Clear  **************************************** */ 
        // list.clear(); // this will remove all elements of list
        // System.out.println(list);   
        
        
/*************************************   Set Element  **************************************** */ 
        // Set Element (index, element) . want to update any element
        list.set(1, 5);
        System.out.println(list);   
        

/*************************************   Contains  **************************************** */ 
        // contains check whether the element is present or not
        System.out.println(list.contains(5));  
        

/*************************************   Iterate ArrayList  **************************************** */ 
        // Differen ways to iterate arraylist
        // for loop
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");   
        }
        System.out.println();   
        
        // for each
        for(int element: list){   // for(Integer ele: list){} this is also correct
            System.out.print(element + " ");   
        }
        
        
        // Iterator
        Iterator<Integer> it = list.iterator();
        // hashnext
        while(it.hasNext()){
          System.out.println(it.next());   
        }
        
    
    }
}