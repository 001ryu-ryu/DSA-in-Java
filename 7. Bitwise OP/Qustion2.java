public class Qustion2 {
    public static int noOfSetBits(int n) {
        int count = 0;
        while(n > 0) {
            if ((n & 1) != 0) {
                count++;
            }

            n = n >> 1;
        }

        return  count;
    }

    public static void main(String[] args) {
        System.out.println(noOfSetBits(4));
    }
}
