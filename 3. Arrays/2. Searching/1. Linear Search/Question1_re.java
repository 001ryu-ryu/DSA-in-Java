public class Question1_re {

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    public static boolean even(int num) {
       int numberOfDigits = digits(num);
       return numberOfDigits % 2 == 0;
        }

        public static int digits(int num) {
            if (num < 0) {
                num = num * -1;
            }
            if (num == 0) {
                return 1;
            }
            int count = 0;
            while(num != 0) {
                num = num/10;
                count++;
            }
            return count;
        }
    
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};

        System.out.println(findNumbers(arr));
    }
}
