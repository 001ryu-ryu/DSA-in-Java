public class Abstraction3 {
    public static void main(String[] args) {
        Mustang myHorse = new Mustang();

    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animal Constructor called");
    }
    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse Constructor called");
    }
    void changeColor() {
        color = "dark brown";
    }
    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang Constructor called");
    }
}

class Chiken extends Animal {

    void walk() {
        System.out.println("Walks on 2 legs");
    }
}