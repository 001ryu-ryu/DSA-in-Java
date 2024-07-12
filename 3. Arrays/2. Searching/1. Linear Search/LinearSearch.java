public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {18, 22, 17, 14, 88, 79};
        for (int element : arr) {
            if(element == 22) {
                System.out.println("Found 22");
                break;
            }
        }
    }
}