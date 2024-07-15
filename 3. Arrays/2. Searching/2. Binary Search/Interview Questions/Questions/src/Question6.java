//Mountain Array

public class Question6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 9, 0, -1, -2, -3, -4};
        System.out.println(mountainArray(arr));
    }

    public static int mountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
