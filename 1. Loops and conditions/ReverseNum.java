import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int a = sc.nextInt();
        int b = 0;
        while (a > 0) {
            int rem = a%10;
            b = (b*10)+rem;
            a /= 10;
        }
        System.out.println(b);
    }
}
