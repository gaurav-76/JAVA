import java.util.TreeMap;
import java.util.Map;
import java.util.Iterator;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new TreeMap<>();

        // load factor 0.75
        // The load factor is the measure that decides when to increase the capacity of the Map

        hashMap.put(1, "Gaurav");
        hashMap.put(2, "Raman");
        hashMap.put(4, "Nitesh");
        hashMap.put(5, "Ashish");
        hashMap.put(3, "Diwakar");

        System.out.println(hashMap);

        if (!hashMap.containsKey(4)) {
            hashMap.put(4, "Chand");
        }
        // another way
        hashMap.putIfAbsent(4, "Chand");
        // hashMap.put(4, "Chand");  // it will replace the value if key is present
        System.out.println(hashMap);


        // check if key is present or not
        System.out.println(hashMap.containsKey(2));
        // check if value is present or not
        System.out.println(hashMap.containsValue("Gaurav"));

        // check if map is empty or not empty - true or else false
        System.out.println(hashMap.isEmpty());


        // remove
        hashMap.remove(1);
        System.out.println(hashMap);

        // get value
        System.out.println(hashMap.get(5));

/*----------------------Different way to iterate map ---------------------------- */        
        
        // Using an enhanced for loop to iterate over the entry set:
        // for(Map.Entry<Integer, String> temp1: hashMap.entrySet()){
        //     System.out.println(temp.getKey() + " - " + temp.getValue());
        // }

        //Using an iterator on the entry set:
        // 
    
        //Using the forEach method introduced in Java 8:
        // hashMap.forEach((key, value) -> {
        //     System.out.println(key + " - " + value);
        // });

        //Iterating over the key set:
        // for(Integer key: hashMap.keySet()){
        //     System.out.println(key + " - " + hashMap.get(key));
        // }

        // Iterating over the values: if you need only values
        // for(String val: hashMap.values()){
        //     System.out.println(val);
        // }
        
    }
}
