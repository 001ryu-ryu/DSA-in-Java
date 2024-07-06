public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x); //90
        int x; //The class varoable at line 2 is shadowed by this
        // System.out.println(x); //scope will begin when value is initialized
        x = 40;
        System.out.println(x); //40

        fun();
    }

    public static void fun() {
        System.out.println(x);
    }
}