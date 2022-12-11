package composition.SamiLivingRoom;

public class Window {

    private boolean isOpen;
    private boolean isLocked;

    public Window(boolean isOpen, boolean isLocked){
        isOpen = isOpen;
        isLocked = isLocked;
    }
    public boolean IsOpen(){
        return isOpen;
    }
    public boolean IsLocked(){
        return isLocked;
    }
    public void setOpen(boolean Open){
        isOpen = Open;
    }
   public void setLocked(boolean locked){
        isLocked = locked;
   }
    public void open(){
        this.isOpen = true;
        System.out.println("window is now open");
    }
    public void close(){
        this.isOpen = false;
        System.out.println("window is now closed");
    }
    public void lock(){
        if (this.isOpen){
            close();
        }
        System.out.println("window is locked now");
    }

}
