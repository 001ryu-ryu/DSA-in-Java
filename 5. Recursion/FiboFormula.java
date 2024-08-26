public class FiboFormula {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(fiboForm(i));
        }
    }

    public static int fiboForm(int n) {
        return (int)(Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }
}
