public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}

// Base Class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("breaths");
    }
}

// Derived Class/Sub class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims in water");
    }
}
