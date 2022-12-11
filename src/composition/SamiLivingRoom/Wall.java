package composition.SamiLivingRoom;

public class Wall {

    public  enum  Directions {
        NORTH, EAST, WEST, SOUTH;
    }

    private String direction;
    private String color;

    public Wall(Directions direction, String color){
        this.direction = direction.toString();
        this. color = color;
    }

    public void setDirection(Directions direction){
        this.direction = direction.toString();
    }
    public String getDirection(){
        return direction;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

}
