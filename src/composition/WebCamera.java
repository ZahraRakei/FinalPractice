package composition;

public class WebCamera {
    String resolution;
    boolean isHD;

    public WebCamera(String resolution, boolean isHD){
        this.resolution = resolution;
        this.isHD = isHD;

    }
    void takePicture(){
        System.out.println("Taking picture using web camera ..");
    }
}
