public class Question2 {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {3,2,3},
        };

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println(i+0 +"st customer has wealth " + sum);

        }
    }
}
