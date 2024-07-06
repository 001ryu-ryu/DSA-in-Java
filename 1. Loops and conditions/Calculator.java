import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.print("Enter operator: ");
            char op = sc.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter two numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
               
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1*num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1/num2;
                    } else {
                        System.out.println(ans + " is undefined");
                    }
                }
                if (op == '%') {
                    if(num1!=num2) {
                        ans = num1%num2;
                    } else {
                        System.out.println("Cannot divided by 0");
                    }
                }
            } else if( op == 'Q' || op == 'q') {
                break;
            } else {
                System.out.println("Please enter +, -, *, / or %");
            }
            System.out.println(ans + " is the result");
            System.out.println("Enter q to quit");
        }
    }
}
