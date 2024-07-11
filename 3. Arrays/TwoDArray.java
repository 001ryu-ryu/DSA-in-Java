
import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        } 
        // Output
        // for (int row = 0; row < arr.length; row++) {
        //     // for each col in every row
        //     for (int col = 0; col < arr[row].length; col++) {
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }
        for (int[] arr1 : arr) {
            System.out.println(Arrays.toString(arr1));
        }

    }
}
