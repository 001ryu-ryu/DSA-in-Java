public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chiken c = new Chiken();
        c.eat();
        c.walk();
    }
}

abstract class Animal {
    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chiken extends Animal {
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}