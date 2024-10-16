package kunal;

public class ElectricEngine implements Engine, Acc {

    @Override
    public void acc() {
        System.out.println("Electic Engine accelerate");
    }

    @Override
    public void start() {
        System.out.println("Electic Engine start");
    }

    @Override
    public void stop() {
        System.out.println("Electic Engine stop");
    }
    
}
