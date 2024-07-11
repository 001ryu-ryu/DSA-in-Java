
import java.util.ArrayList;

// To print/get an element on any index

public class Get {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(34);
        list.add(87);
        System.out.println(list.get(1));

        // to check if an element exists
        System.out.println(list.contains(2));

        // to replace an element
        System.out.println(list);
        list.set(1, 3);
        System.out.println(list);
    }
}
