public class Question1 {
    public static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid element is greater than the next element
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Check if mid element is smaller than the previous element
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Decide which half to choose for the next step
            if (arr[mid] >= arr[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // If the array is not rotated
        return -1;
    }

    public static int binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int searchInRotatedArray(int[] arr, int target) {
        int pivot = pivot(arr);

        // If array is not rotated, perform normal binary search
        if (pivot == -1) {
            return binarySearch(arr, 0, arr.length - 1, target);
        }

        // If target is the pivot
        if (arr[pivot] == target) {
            return pivot;
        }

        // If target is in the left sorted array
        if (target >= arr[0]) {
            return binarySearch(arr, 0, pivot, target);
        }

        // If target is in the right sorted array
        return binarySearch(arr, pivot + 1, arr.length - 1, target);
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 1;
        System.out.println(searchInRotatedArray(arr, target)); // Should print the index of target, which is 5
    }
}
