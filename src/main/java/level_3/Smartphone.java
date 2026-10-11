package level_3;

public class Smartphone implements Phone{

    public void takePhoto() {
        IO.println("Smartphone takes a photo.");
    }
    @Override
    public void call() {
        IO.println("Smartphone makes a call.");
    }
}
