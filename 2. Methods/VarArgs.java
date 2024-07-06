// Variable length arguments

import java.util.Arrays;

public class VarArgs {

    public static void fun(int ...m) {
        System.out.println(Arrays.toString(m));


    }

    public static void multiple(int a, int b, String ...m) {
        // Mixture of different data types arguments
    }
     public static void main(String[] args) {
        fun(1,2,3,4454,87,980,2980);

        multiple(1, 2, "Mamtaz", "Iftikar");
    }
}
