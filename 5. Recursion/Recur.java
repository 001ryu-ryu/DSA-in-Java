public class Recur {
    public static void main(String[] args) {
        reccur(1);
        
    }

    public static void reccur(int n) {
        if (n == 10) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        reccur(n + 1);
    }
}