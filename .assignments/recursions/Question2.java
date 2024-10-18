public class Question2 {
    public static void convert(int[] arr, int i) {
        if(i == arr.length) {
            return;
        }
        switch (arr[i]) {
            case 0:
                System.out.print("zero" + " ");
                break;
            case 1:
                System.out.print("one" + " ");
                break;
            case 2:
                System.out.print("two" + " ");
                break;
            case 3:
                System.out.print("three" + " ");
                break;
            case 4:
                System.out.print("four" + " ");
                break;
            case 5:
                System.out.print("five" + " ");
                break;
            case 6:
                System.out.print("six" + " ");
                break;
            case 7:
                System.out.print("seven" + " ");
                break;
            case 8:
                System.out.print("eight" + " ");
                break;
            case 9:
                System.out.print("nine" + " ");
                break;
        
            default:
                break;
        }
        convert(arr, i+1);
    }

    //optimized or correct way
    static String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",};
    public static void printDigit(int number) {
        if(number == 0) {
            return;
        }

        int lastDigit = number % 10;
        printDigit(number/10);
        System.out.print(digits[lastDigit] + " ");
    }
    public static void main(String[] args) {
       // int[] arr = {1, 9, 4, 7};
        //convert(arr, 0);
      //  System.out.println();

      printDigit(1947);
    }
}
