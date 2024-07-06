// check if a 3 digit number is armstrong or not

import java.util.Scanner;

public class Armstrong {

    public static void arm(int a) {
        int original = a;
        int sum = 0;
        while (a>0) {
            int rem = a%10;
            rem = rem*rem*rem;
            sum += rem;
            a /= 10;
        }
        if ( original == sum) {
            System.out.println("This is an Armstrong number.");
        } else {
            System.out.println("Not");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        arm(num);
    }
}
