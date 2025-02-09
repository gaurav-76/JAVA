import java.lang.*;

public class TwoDArray {
    public static void main(String[] args) {
        
        //2D array
        //Both way of declaration are correct
        int arr[][] = new int[3][3];
        
        int[][] arr1 = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                arr1[i][j] = (int)(Math.random() * 10);
            }
        }

        
        for(int n[]: arr1){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
        
    }
}
