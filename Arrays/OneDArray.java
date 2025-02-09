
public class OneDArray {
    public static void main(String args[]){

        //1D array
        //Both way of declaration are correct

        int arr[] = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        
        int[] arr1 = {1, 2, 3};

        for(int i = 0; i < 3; i++){
            System.out.print(arr1[i] + " ");
        }
    }    
}
