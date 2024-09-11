public class MultInheritance {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eat();
    }
}

interface Harbivore {
    void eat();
}

interface Carnivore {
    void eat();
}

class Bear implements Harbivore, Carnivore {
    public void eat() {
        System.out.println("Eats both grass and meat");
    }
}
