package composition.room;

public class MainDriver {

    public static void main(String[] args) {


        Frij myFrij = new Frij(160, "sideBySide");
        Sink mySink = new Sink("silver", "steel", "large", true);
        Island myIsland = new Island(true, "brown");
        Stove myStove = new Stove("steel","silver");

        Room myRoom = new Room(myFrij, myIsland, mySink, myStove);



        myRoom.stove.turnOn();
        myRoom.stove.turnOff();
        myRoom.island.reportColor(myIsland.islandColor);
    }

}
