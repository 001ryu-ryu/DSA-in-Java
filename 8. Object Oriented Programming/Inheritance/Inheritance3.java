package inheritance3;

public class Inheritance3 {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.swim();

        Bird parrot = new Bird();
        parrot.fly();

        Mamal dog = new Mamal();
        dog.walk();
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
    void swim() {
        System.out.println("Swims");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Flies");
    }
}

class Mamal extends Animal {
    void walk() {
        System.out.println("Walks");
    }
}
