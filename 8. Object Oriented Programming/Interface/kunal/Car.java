package kunal;

public class Car implements Engine, Brake, Acc {

    @Override
    public void acc() {
        System.out.println("I accelerate like a normal car");
    }

    @Override
    public void brake() {
        System.out.println("I brake like a noraml car");
    }

    @Override
    public void start() {
        System.out.println("I start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal car");
    }
    
}
