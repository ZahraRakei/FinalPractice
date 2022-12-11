package composition.room;



import composition.room.Frij;
import composition.room.Island;
import composition.room.Sink;
import composition.room.Stove;

    public class Room {

        Frij frij;
        Stove stove;
        Island island;
        Sink sink;

        public Room(Frij frij, Island island, Sink sink, Stove stove){
            frij = frij;
            island = island;
            sink = sink;
            stove = stove;
        }


}
