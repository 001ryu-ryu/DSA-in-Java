package kunal;

public class CdPlayer implements Media {

    @Override
    public void start() {
        System.out.println("Media player start");
    }

    @Override
    public void stop() {
        System.out.println("Media player stop");
    }
    
}
