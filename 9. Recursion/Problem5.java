// sum of first N natural numbers
public class Problem5 {
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sum(9));
    }
}