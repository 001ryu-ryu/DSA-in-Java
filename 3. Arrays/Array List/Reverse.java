
import java.util.Arrays;

public class Reverse {
    public static void swap(int[] arr, int index1, int index3) {
        int temp = arr[index1];
        arr[index1] = arr[index3];
        arr[index3] = temp;
    }

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start < end) {
            //swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, 5, 6, 0};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
