
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter 5 elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
     System.out.println("Array is: ");
    //    for (int i = 0; i < arr.length; i++) {
    //     System.out.print(arr[i] + " ");
    //    }

    // Enhanced print
    for(int num : arr) {
        System.out.print(num + " ");
    }
       System.out.println();
    }
}