import java.util.Arrays;
import java.util.List;

public class ArrayClassExample {
    public static void main(String[] args) {
    
/*---------------------Sorting--------------------- */       
        int[] numbers = {1,5,2,6,7,3,9,4};
        //sort(original array) - The entire array is sorted in ascending order
        //sort(originalArray, fromIndex, endIndex) - The specified range of the array is sorted in ascending order.
        // sort(original array, comparator) - The specified array of the objects according to the order which is induced by the comparator is sorted by this.
        Arrays.sort(numbers);

        for(int num: numbers){
            System.out.print(num);
        }
        System.out.println();

/*---------------------Binary Search--------------------- */        
        //binarySearch() -It searches for an element contained in the sorted array by using Binary Search Algorithm.
        /*binarySearch(array, fromIndex, toIndex, key, Comparator) - A range of specified arrays for the specified object is 
        searched using the Binary Search Algorithm. */
        int idx = Arrays.binarySearch(numbers, 4);
        System.out.println(idx);

/*---------------------Copy Array--------------------- */ 
        // copyOf
        //copyOfRange(originalArray, fromIndex, endIndex) - The concerned range of the concerned array is copied into the new array.
        //copyOf(originalArray, newLength) - Copies the specified array, truncating or padding with the default value (if necessary) so the copy has the specified length.
        int arr[] = Arrays.copyOf(numbers, 1);
        // for(int num: arr){
        //     System.out.print(num);
        // }
        //System.out.println(arr.toString());
        
/*---------------------Fill Value--------------------- */ 
        // want to fill array with specific number
        //fill(original array, fill value) - The fill value is assigned to each index of the arrays.
        Arrays.fill(numbers, 0);
        for(int num: numbers){
            System.out.print(num);
        }
        System.out.println();

/*---------------------Equals--------------------- */ 
        //equals (array1, array2) - 	Will check if both the arrays are equal or not. Two arrays are considered equal if both arrays contain the same number of elements and all corresponding pairs of elements in the two arrays are equal.
        boolean result = Arrays.equals(numbers, arr);
        System.out.println(result);

/*---------------------Int to String--------------------- */ 
        //toString(original array) - The toString() method is used to convert an array into a string representation. It takes an array as a parameter and returns a string representation of the array.
        String str = arr.toString();
        System.out.println(str);

/*---------------------Array to List--------------------- */ 
        //asList (Original Array) - It is used to convert an array to a list of elements.
        String[] str1 = {"Java", "is", "Awesome"};
        List<String> str2 = Arrays.asList(str1);
        System.out.println(str2);

/*---------------------Parallel Sort--------------------- */ 
        //parallel Sort(original array) - Sorts the concerned array using the parallel sort.
        int psort[] = {5, 3, 8, 2, 9, 1};
        Arrays.parallelSort(psort);
        System.out.println(psort);

/*---------------------Mismatch--------------------- */ 
        //mismatch(array1,array2) - It will search and return the index of the first unmatched element between the 2 arrays.
        int index = Arrays.mismatch(arr, psort);
        System.out.println(index);

/*---------------------Compare--------------------- */ 
        //compare(array 1, array2) - Compares two arrays lexicographically.
        //-1 if arr1 < arr2, 0 if arr1 == arr2, 1 if arr1 > arr2
        int result1 = Arrays.compare(numbers, arr);
        System.out.println(result1);

/*---------------------Deep--------------------- */ 
        //deepEquals(Object[]a1, Object[]a2) - Returns true if the two specified arrays are deeply equal to one another.
        int[][] arr1 = {{1, 2}, {3, 4}};
        int[][] arr2 = {{1, 2}, {3, 4}};
        boolean isEqual = Arrays.deepEquals(arr1, arr2);
        System.out.println(isEqual);

        //deepToString(Object[]a) - A string representation of the deep contents and details of the concerned array is returned.
        String str3 = Arrays.deepToString(arr1);
        System.out.println(str3);

        //deepCopyOf(original array) - Creates a deep copy of the specified array.
        // int[][] newArr = Arrays.deepCopyOf(arr1);
        // System.out.println(Arrays.deepToString(newArr));
        

    }
}
