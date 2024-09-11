public class Inheritance4 {
    public static void main(String[] args) {
        Dog dogpool = new Dog();
        dogpool.legs = 4;
        dogpool.walk();
        dogpool.bark();
        System.out.println(dogpool.legs);
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

class Fish extends Animal {
    void swims() {
        System.out.println("Swims");
    }
}

class Mamal extends Animal {
    void walk() {
        System.out.println("Walks");
    }
}

class Dog extends Mamal {
    int legs;
    void bark() {
        System.out.println("Barks");
    }
}