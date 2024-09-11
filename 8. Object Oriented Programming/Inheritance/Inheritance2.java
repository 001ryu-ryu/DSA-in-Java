public class Inheritance2 {
    public static void main(String[] args) {
        Dog pakun = new Dog();
        pakun.eat();
       pakun.legs = 4;
        System.out.println(pakun.legs);
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("breaths");
    }
}

class Mammals extends Animal {
    int legs;
}

class Dog extends Mammals {
    String breed;
}