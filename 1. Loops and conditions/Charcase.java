import java.util.Scanner;

public class Charcase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("lower");
        } else {
            System.out.println("Upper");
        }
    }
}