public class Problem1 {
    public static void main(String[] args) {
        int n = 5;
        printInc(n);
    }

    public static void printInc(int n) {
    if (n == 1) {
        System.out.print(n + " ");
        return;
    }

    printInc(n - 1);
    System.out.print(n + " ");
}
}

