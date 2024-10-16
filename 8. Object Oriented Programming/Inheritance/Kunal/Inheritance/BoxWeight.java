package Kunal.Inheritance;

public class BoxWeight extends Box {
    double weight;
    public BoxWeight() {
        this.weight = -1;
    }
    @Override
    void greeting() {
        System.out.println("Hey, I am BoxWeight class. Greetings!");
    }

    BoxWeight (BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); //What is this? call the parent class constructer
        //used to initiate values present in parent class
        this.weight = weight;

    }
}
