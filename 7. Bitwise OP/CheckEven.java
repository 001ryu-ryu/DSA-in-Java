import java.util.Scanner;

public class CheckEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbe you wanna check: ");
        int n = sc.nextInt();
        if (isEven(n)) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }

    public static boolean isEven(int n) {
        return (n & 1) == 0;
    }
}