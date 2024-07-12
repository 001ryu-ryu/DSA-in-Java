public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
            {23, 4, 1},
            {18, 12, 3, 9},
            {18, 99, 34, 56}
        };
        outer:
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == 18) {
                    System.out.println("Found " + arr1[j]);
                    break outer;
                }
                
            }
        }
    }
}
