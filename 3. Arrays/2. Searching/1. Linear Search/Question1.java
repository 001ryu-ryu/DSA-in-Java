public class Question1 {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};

       
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            while (arr[i] != 0) {
            arr[i] = arr[i]/10;
            count++;
            }
            if ( count % 2 == 0) {
                System.out.println("Even number of digits!");
            } else {
                System.out.println("Odd number of digits!");
            }
        }
    }
}
