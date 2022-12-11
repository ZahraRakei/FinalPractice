package composition.SamiLivingRoom;

public class MainDriver {
    public static void main(String[] args) {

        Wall wall1 = new Wall(Wall.Directions.EAST, "white");
        Wall wall2 = new Wall(Wall.Directions.NORTH, "Navy");
        Wall wall3 = new Wall(Wall.Directions.WEST, "Silver");
        Wall wall4 = new Wall(Wall.Directions.SOUTH, "red");
        Television television = new Television("samsung", 65, true);
        ElectricFirePlace electricfirePlace = new ElectricFirePlace();
        Window window = new Window(false, true);

        LivingRoom samiLivingRoom = new LivingRoom("wall1", "wall2", "wall3", "wall4", television, electricfirePlace, window);

      //  samiLivingRoom.electricFirePlace.turnOn(ElectricFirePlace.HeatIntensity.LOW);

      //  samiLivingRoom.wall1.getDirection();

        samiLivingRoom.television.turnOn();
    }

}
