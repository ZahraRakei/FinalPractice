package composition.room;

public class Island {

    boolean hasIsland;
    String islandColor;

    public  Island(boolean hasIsland, String islandColor){
        hasIsland = hasIsland;
        islandColor = islandColor;
    }

    public void reportColor(String islandColor) {
        System.out.println(" my island is "+ islandColor);

    }
}
