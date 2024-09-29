import java.util.ArrayList;

public class Syntax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();

        //add function  TC O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1, 9); //O(n)

        System.out.println(list);

        //get function  TC O(1)
        int element = list.get(2);
        System.out.println(element);

        //remove function   TC O(n)
        list.remove(2);
        System.out.println(list);

        //set function  O(n)
        list.set(2, 10);
        System.out.println(list);

        //contains function
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

    }
}