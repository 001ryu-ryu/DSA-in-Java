// First occurenc
public class Problem6 {
    public static int firstOccurence(int[] arr, int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }

        return firstOccurence(arr, key, i+1);
    }

    public static void main(String[] args) {
        int[] arr = {6, 9, 8, 5, 4, 1, 10};
        System.out.println(firstOccurence(arr, 1, 0));
    }
}