abstract class Device {
    String brand ="Samsung";

    abstract void turnOn();

    void showBrand(){
        System.out.println("Brand: " + brand);
    }
}

/**
 * mixedwithMultipleInheritance
 */
interface Camera {
    int MAX_ZOOM = 10;
    void takePhoto();

    default void cameraInfo() {
        System.out.println("Camera is ready");
    } 
}

/**
 * mixedwithMultipleInheritance
 */
interface Musicplayer{
    String TYPE = "Digital";

    void playMusic();

    default void musicInfo(){
        System.out.println("Music player is ready");
    }
    
}

public class Abstraction extends Device implements Camera, Musicplayer {
    @Override
    public void turnOn() {
        System.out.println("Device is turned on");
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking photo with zoom level: " + MAX_ZOOM);
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music of type: " + TYPE);
    }

    public static void main(String[] args) {
        Abstraction device = new Abstraction();
        device.turnOn();
        device.showBrand();
        device.takePhoto();
        device.playMusic();
        device.cameraInfo();
        device.musicInfo();
    }
}