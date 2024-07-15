/*Find the floor
greatest element in array smaller or equal to target
 */

public class Question2 {
    public static int floor(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return  end;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 9, 11, 15};
        int target = 8;
        System.out.println(floor(arr, target));
    }
}
