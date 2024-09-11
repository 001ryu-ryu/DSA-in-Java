// Run Time Polymorphism

public class MethodOverrriding {
    public static void main(String[] args) {
        Deer salluBhai = new Deer();
        salluBhai.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("Eats anything");
    }
}

class Deer {
    void eat() {
        System.out.println("Eats grass");
    }
}