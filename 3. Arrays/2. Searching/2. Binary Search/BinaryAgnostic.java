public class BinaryAgnostic {
    public static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
            } 
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
            }
        }
    }
    return -1;
}
public static void main(String[] args) {
    // int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
    int[] arr = {98, 78, 67, 33, 22, 1};

    System.out.println(orderAgnosticBS(arr, 78));
}
}
