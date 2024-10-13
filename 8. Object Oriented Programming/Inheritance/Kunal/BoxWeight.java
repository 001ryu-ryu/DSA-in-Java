package Kunal;

public class BoxWeight extends Box {
    double weight;
    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); //What is this? call the parent class constructer
        //used to initiate values present in parent class
        this.weight = weight;

    }
}
