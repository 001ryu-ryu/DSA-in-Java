public class Max {
    public static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, 5, 6};
        System.out.println(max(arr));

    }
}
