// x^n with TC O(logn)
public class Problem8Opt {
    public static int optimizedPower(int x, int n) {
        if(n == 0) {
            return 1;
        }
        
        int halfpower = optimizedPower(x, n/2);

        if(n % 2 != 0) {
            return x * halfpower * halfpower;
        }

        return halfpower * halfpower;
    }

    public static void main(String[] args) {
        System.out.println(optimizedPower(2, 5));
    }
}