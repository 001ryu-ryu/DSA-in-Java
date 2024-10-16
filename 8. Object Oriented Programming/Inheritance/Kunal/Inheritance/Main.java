package Kunal.Inheritance;

public class Main {
    public static void main(String[] args) {
        // Box box1 = new Box(4.6, 7.9, 9.9);
        // Box box2 = new Box(box1);
        // System.out.println(box1.l + " " + box1.w + " " + box1.h);

        BoxWeight box3 = new BoxWeight();

        BoxWeight box4 = new BoxWeight(2, 3, 4, 8);
        System.out.println(box4.h + " " + box4.weight);

        Box box5 = new BoxWeight(); // you can inherit but you cannot override
        box5.greeting();
    }
}
