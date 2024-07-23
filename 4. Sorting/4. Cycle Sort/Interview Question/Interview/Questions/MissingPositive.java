public class MissingPositive {
    public static void main(String[] args) {
        int arr[] = {3, 4, -1, 1};
        System.out.println(missingSmallestPositive(arr));
    }

    public static int missingSmallestPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }
        return arr.length + 1;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
