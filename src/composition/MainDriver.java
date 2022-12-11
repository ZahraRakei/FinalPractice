package composition;

public class MainDriver {

    public static void main(String[] args) {
        WebCamera webCamera = new WebCamera("2560 x 1080", true);
        Monitor acer = new Monitor("Acer", "2560 x1080", true, webCamera);
        Keyboard logiteck = new Keyboard("Logiteck", false,true);
        Mouse apple = new Mouse("Apple",false, true, true);

        Computer lenovo = new Computer(acer, logiteck, apple);

        System.out.println(lenovo.mouse.isOptical);

        lenovo.monitor.webcamera.takePicture();

//
    }
}
