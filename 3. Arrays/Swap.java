
import java.util.Arrays;

public class Swap {
    public static void swap(int[] arr, int index1, int index3) {
        int temp = arr[index1];
        arr[index1] = arr[index3];
        arr[index3] = temp;
    }
    public static void main(String[] args) {
        int[] arrr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(arrr));

        swap(arrr, 1, 3);
        System.out.println(Arrays.toString(arrr));
    }
}
